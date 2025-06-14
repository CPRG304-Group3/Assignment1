package shapes;

import utilities.GeometricShapeADT;
import java.awt.*;

public class Cone extends GeometricShapeADT {
    private double radius;
    private double height;

    public Cone() {
        super();
    }

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double calcBaseArea() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public double calcVolume() {
        return ((Math.PI * Math.pow(this.radius, 2)) * this.height)/3.0;
    }
}
