package shape_problem;

import shape_problem.abstract_class.Rectangle;
import shape_problem.abstract_class.Shape;
import shape_problem.abstract_class.Triangle;
import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

    public static void printShapeDetails(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle("blue", 10, 5));
        shapes.add(new Triangle("red", 8, 6));
        shapes.add(new Rectangle("green", 7, 3));

        printShapeDetails(shapes);
    }
}
