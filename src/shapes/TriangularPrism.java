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

    public TriangularPrism(double height, double side) {
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

    @Override
    public String toString() {
        return ("Class is: " + getClass() + " With a height of: " +  getHeight() +
                " With a volume of: " + calcVolume() + " With a base area of: " + calcBaseArea());
    }

}
