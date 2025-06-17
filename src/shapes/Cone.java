package shapes;

import utilities.GeometricShapeADT;

public class Cone extends GeometricShapeADT {
    private double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Cone() {
        super();
    }

    public Cone(double height, double radius) {
        setHeight(height);
        setRadius(radius);
    }

    @Override
    public double calcBaseArea() {
        return (Math.PI * Math.pow(getRadius(), 2));
    }

    @Override
    public double calcVolume() {
        return ((Math.PI * Math.pow(getRadius(), 2)) * this.getHeight())/3.0;
    }

    @Override
    public String toString() {
        return ("Class is: " + getClass() + " With a height of: " +  getHeight() +
                " With a volume of : " + calcVolume() + " With a base area of :" + calcBaseArea());
    }
}
