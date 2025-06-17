package utilities;

public abstract class GeometricShapeADT implements Comparable<GeometricShapeADT> {
    private double height;

    protected GeometricShapeADT() {
        this.height = 5.0;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract double calcVolume();
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
