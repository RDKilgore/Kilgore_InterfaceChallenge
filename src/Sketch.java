import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Collections;

public class Sketch extends PApplet {
    Shape shape;
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void settings() {
        size(700, 500);
    }

    public void setup() {
        add(shapes);
        display(shapes);
        System.out.println(String.format("The total number of shapes created are: %d", Shape.getNumShapes()));
        Collections.sort(shapes);
        System.out.println("\nThe shapes have been placed in ascending order");
        background(100,35,230);
        display(shapes);
        //shapes.draw(this);
    }

    private static void add(ArrayList<Shape> shapes) {
        shapes.add(new Circle(new Point(50, 75), 70.0));
        shapes.add(new Circle(new Point(650, 75), 70.0));
        shapes.add(new Rectangle(new Point(262.5, 375.0), 175.0, 125.0));
        shapes.add(new Rectangle(new Point(175.0, 250.0), 350, 125.0));
        shapes.add(new Rectangle(new Point(87.5, 125.0), 525.0, 125.0));
        //shapes.add(new Rectangle(new Point(0.0, 375.0), 700.0, 125.0));
        shapes.add(new Triangle(new Point(0,375),new Point(0,500),new Point(175,500)));
        shapes.add(new Triangle(new Point(700,375),new Point(525,500),new Point(700,500)));
    }

    private void display(ArrayList<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
            shape.draw(this);
        }
    }
}
