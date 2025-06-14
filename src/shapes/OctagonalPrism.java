package shapes;

import utilities.GeometricShapeADT;

public class OctagonalPrism extends GeometricShapeADT {
    private double side;
    private double height;

    public OctagonalPrism() {
        super();
    }

    public OctagonalPrism(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calcBaseArea () {
        return 2.0 * (1 + Math.sqrt(2)) * Math.pow(this.side, 2);
    }

    @Override
    public double calcVolume() {
        return calcBaseArea() * this.height;
    }
}
