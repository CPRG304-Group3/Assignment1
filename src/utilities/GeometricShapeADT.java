package utilities;

public abstract class GeometricShapeADT {
    private double height;

    protected GeometricShapeADT() {
        this.height = 5.0;
    }

    abstract public double calcVolume();

    abstract public double calcBaseArea();
}
