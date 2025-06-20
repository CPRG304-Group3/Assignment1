package shapes;

import utilities.GeometricShapeADT;

/**
 * This class represents an Octagonal Prism shape that extends the GeometricShapeADT
 */
public class OctagonalPrism extends GeometricShapeADT {

    /**
     * Side defined for the Octagonal Prism shape
     */
    private double side;

    /**
     * Returns the side of the specified instance of an Octagonal Prism
     * @return the side of the octagonal prism
     */
    public double getSide() {
        return this.side;
    }

    /**
     * Sets the side of the specified instance of an Octagonal Prism
     * @param side is the value used to set the side of the octagonal prism
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * No-arg constructor that initializes the Octagonal Prism object using the
     * default parent constructor
     */
    public OctagonalPrism() {
        super();
    }

    /**
     * Constructor that initializes the Octagonal Prism object using the given values
     * @param height is the value used to initialize the octagonal prism's height
     * @param side is the value used to initialize the octagonal prism's side
     */
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
                " With a volume of: " + calcVolume() + " With a base area of: " + calcBaseArea());
    }
}
