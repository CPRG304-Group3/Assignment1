package utilities;

import java.util.Comparator;

public class GeometricShapeComparatorV implements Comparator<GeometricShapeADT> {
    @Override
    public int compare(GeometricShapeADT o1, GeometricShapeADT o2) {
        if (o1.calcVolume() > o2.calcVolume()) {
            return 1;
        } else if (o1.calcVolume() < o2.calcVolume()) {
            return -1;
        } else  {
            return 0;
        }
    }
}
