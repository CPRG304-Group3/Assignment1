package utilities;

import java.util.Comparator;

/**
 * This class is the Comparator to be used when comparing by base area
 */
public class GeometricShapeComparatorB implements Comparator<GeometricShapeADT> {
    @Override
    public int compare(GeometricShapeADT o1, GeometricShapeADT o2) {
        if (o1.calcBaseArea() > o2.calcBaseArea()) {
            return 1;
        } else if (o1.calcBaseArea() < o2.calcBaseArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
