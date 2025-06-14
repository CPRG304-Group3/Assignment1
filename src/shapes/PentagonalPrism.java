package shapes;

import utilities.GeometricShapeADT;

public class PentagonalPrism extends GeometricShapeADT {
    private double side;
    private double height;

    public PentagonalPrism() {
        super();
    }

    public PentagonalPrism(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calcBaseArea() {
        return (5 * Math.pow(this.side, 2) * Math.tan(54))/4.0;
    }

    @Override
    public double calcVolume() {
        return calcBaseArea() * this.height;
    }
}
