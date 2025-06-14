package shapes;

import utilities.GeometricShapeADT;

import java.awt.*;

public class Cylinder extends GeometricShapeADT {
    private double radius;
    private double height;

    public Cylinder() {
        super();
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calcBaseArea() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public double calcVolume() {
        return (Math.PI * Math.pow(this.radius, 2)) * this.height;
    }
}
