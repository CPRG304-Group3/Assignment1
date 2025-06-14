package shapes;

import utilities.GeometricShapeADT;

public class PentagonalPrism extends GeometricShapeADT {
    private double side;

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public PentagonalPrism() {
        super();
    }

    public PentagonalPrism(double side, double height) {
        setSide(side);
        setHeight(height);
    }

    @Override
    public double calcBaseArea() {
        return (5 * Math.pow(getSide(), 2) * Math.tan(54))/4.0;
    }

    @Override
    public double calcVolume() {
        return calcBaseArea() * getHeight();
    }
}
