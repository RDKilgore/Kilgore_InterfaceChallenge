import processing.core.PApplet;

abstract class Shape implements Comparable<Shape> {

    private Point position;
    private Point leftBase;
    private Point rightBase;
    private static int numShapes;
    private int id;
    PApplet shape;

    public Shape(Point position){
        this.position=position;
        ++numShapes;
        setId(numShapes);
    }

    public Shape(Point position, Point leftBase, Point rightBase) {
        this.position = position;
        this.leftBase = leftBase;
        this.rightBase = rightBase;
        ++numShapes;
        setId(numShapes);
    }

    public Point getPosition() {
        return position;
    }
    public void setPosition(Point position) {
        this.position = position;
    }
    public Point getLeftBase() {
        return leftBase;
    }
    public void setLeftBase(Point leftBase) {
        this.leftBase = leftBase;
    }
    public Point getRightBase() {
        return rightBase;
    }
    public void setRightBase(Point rightBase) {
        this.rightBase = rightBase;
    }
    public static int getNumShapes(){
        return numShapes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    abstract public double computeArea();
    abstract public double getPerimeter();
    abstract public void draw(PApplet p);

    @Override
    public int compareTo(Shape other){
        int result = this.getClass().getName().compareTo(other.getClass().getName());
        if(result == 0) {
            result = Double.compare(this.computeArea(), other.computeArea());
        }
        if (result == 0 ){
            result = Double.compare(this.getPerimeter(), other.getPerimeter());
        }
        return result;
    }

    public String toString(){
        return String.format("Shape type: %s, ID: %d, Area: %f, Perimeter: %f", getClass().getName(),id, computeArea(),getPerimeter());
    }
}