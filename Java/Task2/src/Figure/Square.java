package Figure;


public class Square extends Figure {

    private final double mSide;

    public Square(Color color, double side) {
        super(color);
        mSide = side;
    }

    public double square() {
        return mSide * mSide;
    }
}
