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

    public static void selectionSort(GeometricShapeADT[] shapesArray) {
        for (int i = 0; i < shapesArray.length; i++) {
            int min = i;

            for (int j = i + 1; j < shapesArray.length; j++) {
                if (shapesArray[j].compareTo(shapesArray[min]) >= 0) min = j;
            }

            GeometricShapeADT temp = shapesArray[min];
            shapesArray[min] = shapesArray[i];
            shapesArray[i] = temp;
        }
    }

    public static void selectionSort(GeometricShapeADT[] shapesArray, Comparator<GeometricShapeADT> comparator) {
        for (int i = 0; i < shapesArray.length; i++) {
            int min = i;

            for (int j = i + 1; j < shapesArray.length; j++) {
                if (comparator.compare(shapesArray[j], shapesArray[min]) >= 0) min = j;
            }

            GeometricShapeADT temp = shapesArray[min];
            shapesArray[min] = shapesArray[i];
            shapesArray[i] = temp;
        }
    }

    private static int partition(GeometricShapeADT[] shapesArray, int low, int high) {
        GeometricShapeADT pivot = shapesArray[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (shapesArray[j].compareTo(pivot) >= 0) {
                i++;
                GeometricShapeADT temp = shapesArray[i];
                shapesArray[i] = shapesArray[j];
                shapesArray[j] = temp;
            }
        }
        GeometricShapeADT temp = shapesArray[i + 1];
        shapesArray[i + 1] = shapesArray[high];
        shapesArray[high] = temp;
        return i + 1;
    }

    public static void quickSort(GeometricShapeADT[] shapesArray, int low, int high) {
        if (low < high) {
            int pivot = partition(shapesArray, low, high);
            quickSort(shapesArray, low, pivot - 1);
            quickSort(shapesArray, pivot + 1, high);
        }
    }
    private static int partition(GeometricShapeADT[] shapesArray, Comparator<GeometricShapeADT> comparator, int low, int high) {
        GeometricShapeADT pivot = shapesArray[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(shapesArray[j], pivot) >= 0) {
                i++;
                GeometricShapeADT temp = shapesArray[i];
                shapesArray[i] = shapesArray[j];
                shapesArray[j] = temp;
            }
        }
        GeometricShapeADT temp = shapesArray[i + 1];
        shapesArray[i + 1] = shapesArray[high];
        shapesArray[high] = temp;
        return i + 1;
    }

    public static void quickSort(GeometricShapeADT[] shapesArray, Comparator<GeometricShapeADT> comparator, int low, int high) {
        if (low < high) {
            int pivot = partition(shapesArray, comparator, low, high);
            quickSort(shapesArray, comparator, low, pivot - 1);
            quickSort(shapesArray, comparator, pivot + 1, high);
        }
    }

}
