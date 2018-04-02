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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle)) {
            return false;
        }

        Square square = (Square) o;

        return mSide == square.mSide &&
                this.getColor().equals(square.getColor()) &&
                this.getName().equals(square.getName());
    }
}
