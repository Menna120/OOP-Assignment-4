package shape_problem.abstract_class;

public class Rectangle extends Shape {
    private final int length;
    private final int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "A " + super.toString() + " rectangle with length " + length + " and width " + width + ". Area is " + getArea();
    }
}
