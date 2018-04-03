package Figure;


public class Circle extends Figure {

    private final double mRadius;

    public Circle(Color color, double radius) {
        super(color);
        mRadius = radius;
    }

    @Override
    public double square() {
        return Math.PI * mRadius * mRadius;
    }
}
