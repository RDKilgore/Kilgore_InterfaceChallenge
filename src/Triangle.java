import processing.core.PApplet;

public class Triangle extends Shape  {
    PApplet p;
    Point pointA;
    Point pointB;
    Point pointC;

    public Triangle(Point position, Point leftBase, Point rightBase) {
        super(position,leftBase,rightBase);
    }

    @Override
    public void draw(PApplet p) {
        this.p= p;
        //p.triangle((float) super.getPosition().getX(), (float) super.getPosition().getY(),(float) length, (float) height);
        System.out.println("Triangle area formula is incorrect");
        p.triangle((float)super.getPosition().getX(),(float)super.getPosition().getY(),(float)super.getLeftBase().getX(),(float)super.getLeftBase().getY(),(float)super.getRightBase().getX(),(float)super.getRightBase().getY());
    }
//    public void move(){
//        p.draw();
//    }

    public double computeArea() { return  (getLeftBase().getX()*(getPosition().getX()- getRightBase().getY())+getPosition().getX()*(getRightBase().getY() -getLeftBase().getY())+getRightBase().getX()*(getPosition().getY()-getLeftBase().getY()))/2; }
    public double getPerimeter() {return 1;}
}