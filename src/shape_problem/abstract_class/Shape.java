package shape_problem.abstract_class;

public abstract class Shape {
    private final String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String toString() {
        return color;
    }
}
