package shapes;

import utilities.GeometricShapeADT;

/**
 * This class represents a Triangular Prism shape that extends the GeometricShapeADT
 */
public class TriangularPrism extends GeometricShapeADT {

    /**
     * Side defined for the Triangular Prism shape
     */
    private double side;

    /**
     * Returns the side of the specified instance of a Triangular Prism
     * @return the side of the triangular prism
     */
    public double getSide() {
        return this.side;
    }

    /**
     * Sets the side of the specified instance of a Triangular Prism
     * @param side is the value used to set the side of the triangular prism
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * No-arg constructor that initializes the Triangular Prism object using the
     * default parent constructor
     */
    public TriangularPrism() {
        super();
    }

    /**
     * Constructor that initializes the Triangular Prism object using the given values
     * @param height is the value used to initialize the triangular prism's height
     * @param side is the value used to initialize the triangular prism's side
     */
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
