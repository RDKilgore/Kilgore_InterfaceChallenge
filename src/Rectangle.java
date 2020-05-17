import processing.core.PApplet;

public class Rectangle extends Shape  {
    PApplet p;
    private double length, height;

    Rectangle(Point upperLeft, double length, double height) {
        super(upperLeft);
        this.length = length;
        this.height = height;
    }

    @Override
    public void draw(PApplet p) {
        this.p= p;
        p.rect((float) super.getPosition().getX(), (float) super.getPosition().getY(),(float) length, (float) height);
    }
//    public void move(){
//        p.draw();
//    }

    public double computeArea() { return  length*height; }
    public double getPerimeter() {return 2*length + 2*height;}
}
