package utilities;

import java.util.Arrays;
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

    public static void quickSort(GeometricShapeADT[] shapesArray, int low, int high) {
        if (low < high) {
            int pivot = partition(shapesArray, low, high);
            quickSort(shapesArray, low, pivot - 1);
            quickSort(shapesArray, pivot + 1, high);
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

    public static void quickSort(GeometricShapeADT[] shapesArray, Comparator<GeometricShapeADT> comparator, int low, int high) {
        if (low < high) {
            int pivot = partition(shapesArray, comparator, low, high);
            quickSort(shapesArray, comparator, low, pivot - 1);
            quickSort(shapesArray, comparator, pivot + 1, high);
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

    public static void mergeSort(GeometricShapeADT[] shapesArray) {
        if (shapesArray.length < 2) {
            return;
        }
        int mid = shapesArray.length / 2;

        GeometricShapeADT[] left = Arrays.copyOfRange(shapesArray, 0, mid);
        GeometricShapeADT[] right = Arrays.copyOfRange(shapesArray, mid, shapesArray.length);
        mergeSort(left);
        mergeSort(right);

        merge(shapesArray, left, right);

    }

    private static void merge(GeometricShapeADT[] shapesArray, GeometricShapeADT[] left, GeometricShapeADT[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) >= 0) {
                shapesArray[k] = left[i];
                k++;
                i++;
            } else {
                shapesArray[k] = right[j];
                k++;
                j++;
            }
        }

        copyRemaining(shapesArray, left, right, i, j, k);
    }

    public static void mergeSort(GeometricShapeADT[] shapesArray, Comparator<GeometricShapeADT> comparator) {
        if (shapesArray.length < 2) {
            return;
        }
        int mid = shapesArray.length / 2;

        GeometricShapeADT[] left = Arrays.copyOfRange(shapesArray, 0, mid);
        GeometricShapeADT[] right = Arrays.copyOfRange(shapesArray, mid, shapesArray.length);
        mergeSort(left, comparator);
        mergeSort(right, comparator);
        merge(shapesArray, comparator, left, right);

    }

    private static void merge(GeometricShapeADT[] shapesArray, Comparator<GeometricShapeADT> comparator, GeometricShapeADT[] left, GeometricShapeADT[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (comparator.compare(left[i], right[j]) >= 0) {
                shapesArray[k] = left[i];
                k++;
                i++;
            } else {
                shapesArray[k] = right[j];
                k++;
                j++;
            }
        }

        copyRemaining(shapesArray, left, right, i, j, k);
    }

    private static void copyRemaining(GeometricShapeADT[] shapesArray, GeometricShapeADT[] left, GeometricShapeADT[] right, int i, int j, int k) {
        while (i < left.length) {
            shapesArray[k] = left[i];
            k++;
            i++;
        }

        while (j < right.length) {
            shapesArray[k] = right[j];
            k++;
            j++;
        }
    }

    public static void heapSort(GeometricShapeADT[] shapesArray) {
        int size = shapesArray.length;

        for (int i = size / 2 - 1; i >= 0; i--) {
            minHeap(shapesArray, size, i);
        }

        for (int i = size - 1; i > 0; i--) {
            GeometricShapeADT temp = shapesArray[0];
            shapesArray[0] = shapesArray[i];
            shapesArray[i] = temp;
            minHeap(shapesArray, i, 0);
        }
    }

    private static void minHeap(GeometricShapeADT[] shapesArray, int length, int rootLoc) {
        int smallest = rootLoc;

        int left = 2 * rootLoc + 1;
        int right = 2 * rootLoc + 2;

        if (left < length && shapesArray[left].compareTo(shapesArray[smallest]) < 0) {
            smallest = left;
        }

        if (right < length && shapesArray[right].compareTo(shapesArray[smallest]) < 0) {
            smallest = right;
        }

        if (smallest != rootLoc) {
            GeometricShapeADT temp = shapesArray[rootLoc];
            shapesArray[rootLoc] = shapesArray[smallest];
            shapesArray[smallest] = temp;
            minHeap(shapesArray, length, smallest);
        }
    }

    public static void heapSort(GeometricShapeADT[] shapesArray, Comparator<GeometricShapeADT> comparator) {
        int size = shapesArray.length;

        for (int i = size / 2 - 1; i >= 0; i--) {
            minHeap(shapesArray, comparator, size, i);
        }

        for (int i = size - 1; i > 0; i--) {
            GeometricShapeADT temp = shapesArray[0];
            shapesArray[0] = shapesArray[i];
            shapesArray[i] = temp;
            minHeap(shapesArray, comparator, i, 0);
        }
    }

    private static void minHeap(GeometricShapeADT[] shapesArray, Comparator<GeometricShapeADT> comparator, int length, int rootLoc) {
        int smallest = rootLoc;

        int left = 2 * rootLoc + 1;
        int right = 2 * rootLoc + 2;

        if (left < length && comparator.compare(shapesArray[left], shapesArray[smallest]) < 0) {
            smallest = left;
        }

        if (right < length && comparator.compare(shapesArray[right], shapesArray[smallest]) < 0) {
            smallest = right;
        }

        if (smallest != rootLoc) {
            GeometricShapeADT temp = shapesArray[rootLoc];
            shapesArray[rootLoc] = shapesArray[smallest];
            shapesArray[smallest] = temp;
            minHeap(shapesArray, comparator, length, smallest);
        }
    }

}
