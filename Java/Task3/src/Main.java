import Figure.Figure;
import Utils.ConfigReader;
import Utils.FiguresComparator;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String file = "./Config.cfg";
        ConfigReader configReader = new ConfigReader(file);
        List<Figure> arrayListOfFigures = configReader.getFiguresFromConfig();

        Map<Figure, Double> figuresMappedToSquares = new HashMap<>();

        for (Figure f : arrayListOfFigures) {
            figuresMappedToSquares.put(f, f.square());
        }

        List<Figure> listOfFigures = new ArrayList<>(figuresMappedToSquares.keySet());
        Collections.sort(listOfFigures, new FiguresComparator());

        for (Figure f : listOfFigures) {
            System.out.format("%15s => Square: %10.2f Color: %8s\n", f.getName(), f.square(), f.getColor());
        }

        // Sort it in another way.
        // Since TreeMap is always sorted by giving Comparator we could use it to sort HashMap.
        Map<Figure, Double> treeMapOfFigures = new TreeMap<>(new FiguresComparator());
        treeMapOfFigures.putAll(figuresMappedToSquares);

        for (Figure f : treeMapOfFigures.keySet()) {
            System.out.format("%15s => Square: %10.2f Color: %8s\n", f.getName(), f.square(), f.getColor());
        }
    }
}
