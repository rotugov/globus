import Figure.Figure;
import Utils.ConfigReader;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String file = "./Config.cfg";
        ConfigReader configReader = new ConfigReader(file);
        List<Figure> arrayListOfFigures = configReader.getFiguresFromConfig();

        for (Figure f : arrayListOfFigures) {
            System.out.format("%15s => Square: %10.2f Color: %8s\n", f.getName(), f.square(), f.getColor());
        }
    }
}
