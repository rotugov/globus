package Figure;


import java.util.Objects;

abstract public class Figure implements Calculable {

    private final String mName;
    private Color mColor;


    public Figure(Color color) {
        mName = this.getClass().getName();
        mColor = color;
    }

    public String getName() {
        return mName;
    }

    public Color getColor() {
        return mColor;
    }

    public void setColor(Color color) {
        mColor = color;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "mName='" + mName + '\'' +
                ", mColor='" + mColor + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(mName, mColor, this.square());
    }
}
