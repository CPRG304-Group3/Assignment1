package shapes;

import utilities.GeometricShapeADT;

public class SquarePrism extends GeometricShapeADT {
    private double side;
    private double height;

    public SquarePrism() {
        super();
    }

    public SquarePrism(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calcBaseArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double calcVolume() {
        return calcBaseArea() * this.height;
    }
}
