package shapes;

import utilities.GeometricShapeADT;

public class SquarePrism extends GeometricShapeADT {
    private double side;

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public SquarePrism() {
        super();
    }

    public SquarePrism(double side, double height) {
        setSide(side);
        setHeight(height);
    }

    @Override
    public double calcBaseArea() {
        return Math.pow(getSide(), 2);
    }

    @Override
    public double calcVolume() {
        return calcBaseArea() * getHeight();
    }
}
