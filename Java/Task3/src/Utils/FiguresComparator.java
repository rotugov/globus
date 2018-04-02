package Utils;

import Figure.Figure;

import java.util.Comparator;


public class FiguresComparator implements Comparator<Figure> {

    @Override
    public int compare(Figure first, Figure second) {

        Double firstSquare = first.square();
        Double secondSquare = second.square();

        if (firstSquare.compareTo(secondSquare) > 0) {
            return 1;
        } else if (firstSquare.compareTo(secondSquare) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
