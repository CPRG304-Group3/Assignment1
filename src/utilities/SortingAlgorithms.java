package utilities;

public class SortingAlgorithms {

    public void bubbleSort(GeometricShapeADT[] shapesArray) {
        GeometricShapeADT temp;

        for (int i = 1; i < shapesArray.length - 1; i++) {
            for (int j = 0; j < shapesArray.length; j++) {
                if (shapesArray[i].getHeight() < shapesArray[j].getHeight()) {
                    temp = shapesArray[j];
                    shapesArray[j] = shapesArray[i];
                    shapesArray[i] = temp;
                }
            }
        }

    }

    public void insertionSort(GeometricShapeADT[] shapesArray) {
        GeometricShapeADT key;
        int j;

        for (int i = 1; i < shapesArray.length; i++) {
            key = shapesArray[i];
            j = i - 1;

            while (j >= 0 && shapesArray[j].getHeight() > key.getHeight()) {
                shapesArray[j + 1] = shapesArray[j];
                j--;
            }
            shapesArray[j + 1] = key;
        }
    }
}
