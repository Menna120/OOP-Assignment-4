package shape_problem.abstract_class;

public class Triangle extends Shape {
    private final int base;
    private final int height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "A " + super.toString() + " triangle with base " + base + " and height " + height + ". Area is " + getArea();
    }
}