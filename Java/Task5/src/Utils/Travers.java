package Utils;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ForkJoinPool;

public class Travers {

    public final static String MARKER = "+ ";
    public final static String INDENT = " ";

    public static void showTree(String path) {
        File root = new File(path);
        Travers.travers(root);
    }

    public static void showTree(String path, String outputFile) throws IOException {

        File root = new File(path);
        File output = new File(outputFile);

        boolean append = false;
        Writer writer = new FileWriter(output, append);

        try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            Travers.travers(root, bufferedWriter);
            bufferedWriter.flush();
        }
    }

    private static void travers(File root) {
        Map<String, List> finalRes = new ConcurrentSkipListMap<>();
        FileSearchTask fileSearchTask = new FileSearchTask(root, finalRes);
        ForkJoinPool.commonPool().invoke(fileSearchTask);

        for (Map.Entry<String, List> items : finalRes.entrySet()) {
            System.out.println(MARKER + items.getKey());
            for (String fileName : (List<String>) items.getValue()) {
                System.out.println(INDENT + MARKER + fileName);
            }
        }
    }

    private static void travers(File root, BufferedWriter output) throws IOException {

        Map<String, List> finalRes = new ConcurrentSkipListMap<>();
        FileSearchTask fileSearchTask = new FileSearchTask(root, finalRes);
        ForkJoinPool.commonPool().invoke(fileSearchTask);

        for (Map.Entry<String, List> items : finalRes.entrySet()) {
            output.write(MARKER + items.getKey());
            output.newLine();
            for (String fileName : (List<String>) items.getValue()) {
                output.write(INDENT + MARKER + fileName);
                output.newLine();
            }
        }
    }
}
