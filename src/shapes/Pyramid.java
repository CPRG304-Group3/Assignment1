package shapes;

import utilities.GeometricShapeADT;

public class Pyramid extends GeometricShapeADT {
    private double side;

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Pyramid() {
        super();
    }

    public Pyramid(double side, double height) {
        setSide(side);
        setHeight(height);
    }

    @Override
    public double calcBaseArea() {
        return Math.pow(getSide(), 2);
    }

    @Override
    public double calcVolume() {
        return (Math.pow(getSide(), 2) * getHeight())/3.0;
    }
}
