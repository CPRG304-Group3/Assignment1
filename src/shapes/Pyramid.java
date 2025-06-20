package shapes;

import utilities.GeometricShapeADT;

/**
 * This class represents a Pyramid shape that extends the GeometricShapeADT
 */
public class Pyramid extends GeometricShapeADT {

    /**
     * Side defined for the Pyramid shape
     */
    private double side;

    /**
     * Returns the side of the specified instance of a Pyramid
     * @return the side of the pyramid
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
     * No-arg constructor that initializes the Pyramid object using the
     * default parent constructor
     */
    public Pyramid() {
        super();
    }

    /**
     * Constructor that initializes the Pyramid object using the given values
     * @param height is the value used to initialize the pyramid's height
     * @param side is the value used to initialize the pyramid's side
     */
    public Pyramid(double height, double side) {
        setSide(side);
        setHeight(height);
    }

    @Override
    public double calcBaseArea() {
        return Math.pow(getSide(), 2);
    }

    @Override
    public double calcVolume() {
        return (Math.pow(getSide(), 2) * getHeight())/3.0;
    }

    @Override
    public String toString() {
        return ("Class is: " + getClass() + " With a height of: " +  getHeight() +
                " With a volume of: " + calcVolume() + " With a base area of: " + calcBaseArea());
    }
}
