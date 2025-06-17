package utilities;

import java.util.Comparator;

public class SortingAlgorithms {

    public static void bubbleSort(GeometricShapeADT[] shapesArray) {
        GeometricShapeADT temp;

        for (int i = 1; i < shapesArray.length; i++) {
            for (int j = 0; j < shapesArray.length; j++) {
                if (shapesArray[i].compareTo(shapesArray[j]) >= 0) {
                    temp = shapesArray[j];
                    shapesArray[j] = shapesArray[i];
                    shapesArray[i] = temp;
                }
            }
        }
    }

    public static void bubbleSort(GeometricShapeADT[] shapesArray, Comparator<GeometricShapeADT> comparator) {
        GeometricShapeADT temp;

        for (int i = 1; i < shapesArray.length; i++) {
            for (int j = 0; j < shapesArray.length; j++) {
                if (comparator.compare(shapesArray[j], shapesArray[i]) < 0) {
                    temp = shapesArray[j];
                    shapesArray[j] = shapesArray[i];
                    shapesArray[i] = temp;
                }
            }
        }
    }

    public static void insertionSort(GeometricShapeADT[] shapesArray) {
        GeometricShapeADT key;
        int j;

        for (int i = 1; i < shapesArray.length; i++) {
            key = shapesArray[i];
            j = i - 1;

            while (j >= 0 && shapesArray[j].compareTo(key) < 0) {
                shapesArray[j + 1] = shapesArray[j];
                j--;
            }
            shapesArray[j + 1] = key;
        }
    }

    public  static void insertionSort(GeometricShapeADT[] shapesArray, Comparator<GeometricShapeADT> comparator) {
        GeometricShapeADT key;
        int j;

        for (int i = 1; i < shapesArray.length; i++) {
            key = shapesArray[i];
            j = i - 1;

            while (j >= 0 && comparator.compare(shapesArray[j], key) < 0) {
                shapesArray[j + 1] = shapesArray[j];
                j--;
            }
            shapesArray[j + 1] = key;
        }
    }
}
