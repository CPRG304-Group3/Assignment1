package shapes;

import utilities.GeometricShapeADT;

import java.awt.*;

public class Cylinder extends GeometricShapeADT {
    private double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Cylinder() {
        super();
    }

    public Cylinder(double height, double radius) {
        setRadius(radius);
        setHeight(height);
    }

    @Override
    public double calcBaseArea() {
        return (Math.PI * Math.pow(getRadius(), 2));
    }

    @Override
    public double calcVolume() {
        return (Math.PI * Math.pow(getRadius(), 2)) * getHeight();
    }

    @Override
    public String toString() {
        return ("Class is: " + getClass() + " With a height of: " +  getHeight() +
                " With a volume of: " + calcVolume() + " With a base area of: " + calcBaseArea());
    }
}
