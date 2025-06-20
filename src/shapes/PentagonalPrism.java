package shapes;

import utilities.GeometricShapeADT;

/**
 * This class represents a Pentagonal Prism shape that extends the GeometricShapeADT
 */
public class PentagonalPrism extends GeometricShapeADT {

    /**
     * Side defined for the Pentagonal Prism shape
     */
    private double side;

    /**
     * Returns the side of the specified instance of a Pentagonal Prism
     * @return the side of the pentagonal prism
     */
    public double getSide() {
        return this.side;
    }

    /**
     * Sets the side of the specified instance of a Pentagonal Prism
     * @param side is the value used to set the side of the pentagonal prism
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * No-arg constructor that initializes the Pentagonal Prism object using the
     * default parent constructor
     */
    public PentagonalPrism() {
        super();
    }

    /**
     * Constructor that initializes the Pentagonal Prism object using the given values
     * @param height is the value used to initialize the pentagonal prism's height
     * @param side is the value used to initialize the pentagonal prism's side
     */
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
