package shapes;

import utilities.GeometricShapeADT;

/**
 * This class represents a Cone shape that extends GeometricShapeADT class.
 */
public class Cone extends GeometricShapeADT {

    /**
     * Radius defined for the Cone shape
     */
    private double radius;

    /**
     * Returns the radius of the specified instance of the Cone
     * @return the radius of the cone
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Sets the radius of the specified instance of the Cone
     * @param radius is the value to set the radius of the cone
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * No-arg constructor that initializes the Cone object using the
     * default parent constructor
     */
    public Cone() {
        super();
    }

    /**
     * Constructor that initializes the Cone object using the given values
     * @param height is the value used to initialize the Cone's height
     * @param radius is the value used to initialize the Cone's radius
     */
    public Cone(double height, double radius) {
        setHeight(height);
        setRadius(radius);
    }

    @Override
    public double calcBaseArea() {
        return (Math.PI * Math.pow(getRadius(), 2));
    }

    @Override
    public double calcVolume() {
        return ((Math.PI * Math.pow(getRadius(), 2)) * this.getHeight())/3.0;
    }

    @Override
    public String toString() {
        return ("Class is: " + getClass() + " With a height of: " +  getHeight() +
                " With a volume of: " + calcVolume() + " With a base area of: " + calcBaseArea());
    }
}
