package Figure;


public class Circle extends Figure {

    private final double mRadius;

    public Circle(Color color, double radius) {
        super(color);
        mRadius = radius;
    }

    public double square() {
        return Math.PI * mRadius * mRadius;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle)) {
            return false;
        }

        Circle circle = (Circle) o;

        return mRadius == circle.mRadius &&
                this.getColor().equals(circle.getColor()) &&
                this.getName().equals(circle.getName());
    }
}
