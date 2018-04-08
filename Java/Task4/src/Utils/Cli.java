package Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cli {


    public static void printUsage() {
        String usage = "The program displays a graphical representation of the directory.\n\n" +
                "usage: java Tree [-path, -file] \n" +
                " -print <file>         print file to stdout.\n" +
                " -file <path> <output> print output to file.\n" +
                " -read <path>          read from a file.\n" +
                " -help                 print help message.";

        System.out.println(usage);
    }

    public static Map<String, List> parse(String[] args) {

        Map<String, List> arguments = new HashMap<>();
        List<String> list = new ArrayList<>();

        try {
            for (int i = 0; i < args.length; i += 2) {
                if (args[i].startsWith("-file")) {
                    list.add(args[i + 1]);
                    list.add(args[i + 2]);
                    arguments.put(args[i], list);
                    break;
                } else {
                    list.add(args[i + 1]);
                }
                arguments.put(args[i], list);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            Cli.printUsage();
            System.exit(-1);
        }

        if (arguments.size() == 0 || arguments.size() > 1) {
            Cli.printUsage();
        }

        return arguments;
    }


}
