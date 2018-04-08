import Utils.Cli;
import Utils.FileUtils;
import Utils.Travers;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Tree {

    public static void main(String[] args) {
        try {

            for (Map.Entry<String, List> entry : Utils.Cli.parse(args).entrySet()) {
                switch (entry.getKey()) {
                    case "-help":
                        Cli.printUsage();
                        break;
                    case "-print":
                        Travers.showTree((String) entry.getValue().get(0));
                        break;
                    case "-file":
                        Travers.showTree((String) entry.getValue().get(0), (String) entry.getValue().get(1));
                        break;
                    case "-read":
                        FileUtils.print((String) entry.getValue().get(0));
                        break;
                    default:
                        Cli.printUsage();
                }
            }
        } catch (IOException e) {
            System.err.println("Smth went wrong! Make sure you run the app right!\n");
            Cli.printUsage();
        }
    }
}
