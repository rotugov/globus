package Utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;


public class FileSearchTask extends RecursiveAction {

    private final File mRoot;
    private Map<String, List> mResult;

    public FileSearchTask(File root, Map<String, List> result) {
        mRoot = root;
        mResult = result;
    }

    public static void main(String[] args) {
        Map<String, List> finalRes = new ConcurrentSkipListMap<>();
        FileSearchTask fileSearchTask = new FileSearchTask(new File("../"), finalRes);
        ForkJoinPool.commonPool().invoke(fileSearchTask);
    }

    @Override
    protected void compute() {
        List<FileSearchTask> tasks = new ArrayList<>();

        File[] files = mRoot.listFiles();
        List<String> currentDirectoryListing = new ArrayList<>();

        if (files != null)
            for (File f : files) {
                if (f.isDirectory()) {
                    FileSearchTask newTask = new FileSearchTask(f, mResult);
                    tasks.add(newTask);
                    newTask.fork(); // Async
                    currentDirectoryListing.add(f.getName());
                } else {
                    currentDirectoryListing.add(f.getName());
                }
            }


        /*
        Key => Current directory.
        Value => Files and directories listing.
        */
        mResult.put(mRoot.getAbsolutePath(), currentDirectoryListing);

        if (tasks.size() > 0) {
            for (FileSearchTask task : tasks) {
                task.join();
            }
        }
    }
}