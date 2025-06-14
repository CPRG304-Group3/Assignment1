package shapes;

import utilities.GeometricShapeADT;

public class Pyramid extends GeometricShapeADT {
    private double side;
    private double height;

    public Pyramid() {
        super();
    }

    public Pyramid(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calcBaseArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double calcVolume() {
        return (Math.pow(this.side, 2) * this.height)/3.0;
    }
}
