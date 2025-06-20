package utilities;

/**
 * This abstract class is the parent class for all shapes in the program.
 * Implements the Comparable interface which is used in the sorting algorithm.
 */
public abstract class GeometricShapeADT implements Comparable<GeometricShapeADT> {

    /**
     * Height exists for each shape object that extends from base class
     */
    private double height;

    /**
     * No-arg constructor for parent class which sets the height
     */
    protected GeometricShapeADT() {
        this.height = 5.0;
    }

    /**
     * Returns the height associated with the object
     * @return the height of the object
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Sets the height of the associated object
     * @param height is the value used to define the height of a shape
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Abstract method that returns the volume for the associated shape
     * @return the value of the volume
     */
    public abstract double calcVolume();

    /**
     * Abstract methods that returns the base area for the associated shape
     * @return the value of the base area
     */
    public abstract double calcBaseArea();

    @Override
    public int compareTo(GeometricShapeADT o) {
        if  (this.getHeight() < o.getHeight()) {
            return -1;
        } else if (this.getHeight() > o.getHeight()) {
            return 1;
        } else {
            return 0;
        }
    }
}
