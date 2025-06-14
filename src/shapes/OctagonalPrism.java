package shapes;

import utilities.GeometricShapeADT;

public class OctagonalPrism extends GeometricShapeADT {
    private double side;

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public OctagonalPrism() {
        super();
    }

    public OctagonalPrism(double side, double height) {
        setSide(side);
        setHeight(height);
    }

    @Override
    public double calcBaseArea () {
        return 2.0 * (1 + Math.sqrt(2)) * Math.pow(getSide(), 2);
    }

    @Override
    public double calcVolume() {
        return calcBaseArea() * getHeight();
    }
}
