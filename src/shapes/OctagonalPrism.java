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

    public OctagonalPrism(double height, double side) {
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

    @Override
    public String toString() {
        return ("Class is: " + getClass() + " With a height of: " +  getHeight() +
                " With a volume of : " + calcVolume() + " With a base area of :" + calcBaseArea());
    }
}
