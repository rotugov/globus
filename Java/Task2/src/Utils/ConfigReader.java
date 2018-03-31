package Utils;

import Figure.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ConfigReader {

    private final static String PATTERN = "^([a-zA-Z]+)\\s+([a-zA-Z]+)\\s+(\\d+)\\s*(\\d*)";

    private final String mFilename;

    public ConfigReader(String filename) {
        mFilename = filename;
    }

    private static Figure getFigure(String figure, Color color, double first, double second) throws Exception {
        switch (figure) {
            case "Triangle":
                return new Triangle(color, first, second);
            default:
                throw new Exception("Wrong config!");
        }
    }

    private static Figure getFigure(String figure, Color color, double first) throws Exception {
        switch (figure) {
            case "Circle":
                return new Circle(color, first);
            case "Square":
                return new Square(color, first);
            default:
                throw new Exception("Wrong config!");
        }
    }

    public List<Figure> getFiguresFromConfig() {

        Pattern r = Pattern.compile(PATTERN);
        List<Figure> arrayListOfFigures = new ArrayList<>();
        String figure;
        Color color;
        Integer first, second;

        try {
            Scanner reader = new Scanner(new File(mFilename));

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                Matcher m = r.matcher(line);

                if (m.find()) {
                    figure = m.group(1);
                    color = Color.valueOf(m.group(2));
                    first = Integer.valueOf(m.group(3));

                    if (m.group(4).compareTo("") != 0) {
                        second = Integer.valueOf(m.group(4));
                        arrayListOfFigures.add(getFigure(figure, color, first, second));
                    } else {
                        arrayListOfFigures.add(getFigure(figure, color, first));
                    }

                } else {
                    continue;
                }
            }

            reader.close();

        } catch (Exception e) {
            System.err.println("Wrong config!");
            System.exit(-1);
        }

        return arrayListOfFigures;
    }
}
