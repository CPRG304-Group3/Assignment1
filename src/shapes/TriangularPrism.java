package shapes;

import utilities.GeometricShapeADT;

public class TriangularPrism extends GeometricShapeADT {
    private double side;

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public TriangularPrism() {
        super();
    }

    public TriangularPrism(double side, double height) {
        setSide(side);
        setHeight(height);
    }

    @Override
    public double calcBaseArea() {
        return (Math.pow(getSide(), 2) * Math.sqrt(3.0))/4.0;
    }

    @Override
    public double calcVolume() {
        return calcBaseArea() * getHeight();
    }
}
