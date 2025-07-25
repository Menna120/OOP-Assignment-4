package shape_problem.interface_class;

public class RectangleImpl implements IShape {
    private final String color;
    private final int length;
    private final int width;

    public RectangleImpl(String color, int length, int width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "A " + color + " rectangle with length " + length + " and width " + width + ". Area is " + getArea();
    }
}
