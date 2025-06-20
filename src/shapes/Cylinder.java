package shapes;

import utilities.GeometricShapeADT;

/**
 * This class represents a Cylinder shape that extends GeometricShapeADT class.
 */
public class Cylinder extends GeometricShapeADT {

    /**
     * Radius defined for the Cone shape
     */
    private double radius;

    /**
     * Returns the radius of the specified instance of a Cylinder
     * @return the radius of the cylinder
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Sets the radius of the specified instance of a Cylinder
     * @param radius is the value used to set the radius of the cylinder
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * No-arg constructor that initializes the Cylinder object using the
     * default parent constructor
     */
    public Cylinder() {
        super();
    }

    /**
     * Constructor that initializes the Cylinder object using the given values
     * @param height is the value used to initialize the cylinder's height
     * @param radius is the value used to initialize the cylinder's radius
     */
    public Cylinder(double height, double radius) {
        setRadius(radius);
        setHeight(height);
    }

    @Override
    public double calcBaseArea() {
        return (Math.PI * Math.pow(getRadius(), 2));
    }

    @Override
    public double calcVolume() {
        return (Math.PI * Math.pow(getRadius(), 2)) * getHeight();
    }

    @Override
    public String toString() {
        return ("Class is: " + getClass() + " With a height of: " +  getHeight() +
                " With a volume of: " + calcVolume() + " With a base area of: " + calcBaseArea());
    }
}
