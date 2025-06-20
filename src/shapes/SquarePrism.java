package shapes;

import utilities.GeometricShapeADT;

/**
 * This class represents a Square Prism shape that extends the GeometricShapeADT
 */
public class SquarePrism extends GeometricShapeADT {

    /**
     * Side defined for the Square Prism shape
     */
    private double side;

    /**
     * Returns the side of the specified instance of a Square Prism
     * @return the side of the square prism
     */
    public double getSide() {
        return this.side;
    }

    /**
     * Sets the side of the specified instance of a Square Prism
     * @param side is the value used to set the side of the square prism
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * No-arg constructor that initializes the Square Prism object using the
     * default parent constructor
     */
    public SquarePrism() {
        super();
    }

    /**
     * Constructor that initializes the Square Prism object using the given values
     * @param height is the value used to initialize the square prism's height
     * @param side is the value used to initialize the square prism's side
     */
    public SquarePrism(double height, double side) {
        setSide(side);
        setHeight(height);
    }

    @Override
    public double calcBaseArea() {
        return Math.pow(getSide(), 2);
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
