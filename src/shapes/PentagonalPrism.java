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

    public PentagonalPrism(double height, double side) {
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

    @Override
    public String toString() {
        return ("Class is: " + getClass() + " With a height of: " +  getHeight() +
                " With a volume of: " + calcVolume() + " With a base area of: " + calcBaseArea());
    }
}
