package shapes;

import utilities.GeometricShapeADT;

public class TriangularPrism extends GeometricShapeADT {
    private double side;
    private double height;

    public TriangularPrism() {
        super();
    }

    public TriangularPrism(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calcBaseArea() {
        return (Math.pow(this.side, 2) * Math.sqrt(3.0))/4.0;
    }

    @Override
    public double calcVolume() {
        return calcBaseArea() * this.height;
    }
}
