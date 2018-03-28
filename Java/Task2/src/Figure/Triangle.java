package Figure;


public class Triangle extends Figure {

    private double mBase;
    private double mHeight;

    public Triangle(Color color, double base, double height) {
        super(color);
        mBase = base;
        mHeight = height;
    }

    public double getBase() {
        return mBase;
    }

    public double getHeight(double h) {
        return mHeight;
    }

    public double square() {
        return 0.5 * mBase * mHeight;
    }
}
