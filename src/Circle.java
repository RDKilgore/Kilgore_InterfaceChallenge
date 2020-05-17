import processing.core.PApplet;

public class Circle extends Shape {

    private double radius;
    PApplet c;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public void draw(PApplet c) {
        this.c = c;
        c.circle((float) super.getPosition().getX(), (float) super.getPosition().getY(),(float) radius);

    }
}