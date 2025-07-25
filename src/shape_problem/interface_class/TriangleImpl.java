package shape_problem.interface_class;

public class TriangleImpl implements IShape {
    private final String color;
    private final int base;
    private final int height;

    public TriangleImpl(String color, int base, int height) {
        this.color = color;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "A " + color + " triangle with base " + base + " and height " + height + ". Area is " + getArea();
    }
}
