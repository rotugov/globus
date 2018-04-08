package Utils;

import java.io.*;

public class Travers {

    public final static String MARKER = "+ ";
    public final static String SEPARATOR = " ";

    public static void showTree(String path) {
        File root = new File(path);
        Travers.travers(root, SEPARATOR);
    }

    public static void showTree(String path, String outputFile) throws IOException {

        File root = new File(path);
        File output = new File(outputFile);

        boolean append = false;
        Writer writer = new FileWriter(output, append);

        try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            Travers.travers(root, SEPARATOR, bufferedWriter);
            bufferedWriter.flush();
        }
    }

    private static void travers(File root, String separator) {

        if (!root.exists()) {
            return;
        }

        if (!root.isDirectory()) {
            System.out.println(separator + MARKER + root.getAbsolutePath());
            System.out.println(separator + separator + MARKER + root.getName());
            return;
        }

        System.out.println(separator + MARKER + root.getAbsolutePath());
        for (File file : root.listFiles()) {
            if (file.isDirectory()) {
                travers(file, separator + separator);
            } else {
                System.out.println(separator + separator + MARKER + file.getName());
            }
        }
    }

    private static void travers(File root, String separator, BufferedWriter output) throws IOException {

        String line = separator + MARKER + root.getAbsolutePath();
        output.write(line);
        output.newLine();

        if (root.isFile()) {
            line = separator + separator + MARKER + root.getName();
            output.write(line);
            return;
        }

        for (File file : root.listFiles()) {
            if (file.isDirectory()) {
                travers(file, separator + separator, output);
            } else {
                line = separator + separator + MARKER + file.getName();
                output.write(line);
                output.newLine();
            }
        }
    }
}
