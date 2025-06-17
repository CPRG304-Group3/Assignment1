package appDomain;

import shapes.*;
import utilities.GeometricShapeADT;
import utilities.GeometricShapeComparatorB;
import utilities.GeometricShapeComparatorV;
import utilities.SortingAlgorithms;

import java.io.*;
import java.util.Comparator;
import java.util.Scanner;

public class AppDriver
{

	public static void main( String[] args )
	{
		// Initialization of variables for user argument values
		String filename = "";
		char compareBy = 0;
		char sortingAlgorithm = 0;

		// Validate arguments passed with program needs
		if (args.length != 3){
			System.out.println("You need to pass 3 arguments (T, F & S)");
			System.exit(0);
		}

		// Validate that values are passed with each argument
		if (args[0].length() <= 2 || args[1].length() <= 2 || args[2].length() <= 2){
			System.out.println("You need to pass data with each argument");
			System.exit(1);
		}

		// Store the choice given by user for program
		for (String argument: args) {
			if (argument.startsWith("-t") || argument.startsWith("-T")) {
				compareBy = argument.charAt(2);
			} else if (argument.startsWith("-f") || argument.startsWith("-F")) {
				filename = argument.substring(2);
			} else if (argument.startsWith("-s") || argument.startsWith("-S")) {
				sortingAlgorithm = argument.charAt(2);
			} else {
				System.out.println("Invalid argument provided for the program (-T, -F & -S)");
				System.exit(1);
			}
		}

		try (BufferedReader input = new BufferedReader(new FileReader(filename))) {
			String line;
			int arraySize = 0;
			int counter = 0;

			GeometricShapeADT[] allShapes = new GeometricShapeADT[Integer.parseInt(input.readLine())];

			while ((line = input.readLine()) != null) {
				String[] lineValues = line.split(" ");
				if (lineValues.length == 3) {
					String shape = lineValues[0].trim();
					double height = Double.parseDouble(lineValues[1].trim());
					double side = Double.parseDouble(lineValues[2].trim());
					switch (shape) {
						case "Cone":
							allShapes[counter] = new Cone(height, side);
							break;
						case "Cylinder":
							allShapes[counter] = new Cylinder(height, side);
							break;
						case "Pyramid":
							allShapes[counter] = new Pyramid(height, side);
							break;
						case "OctagonalPrism":
							allShapes[counter] = new OctagonalPrism(height, side);
							break;
						case "PentagonalPrism":
							allShapes[counter] = new PentagonalPrism(height, side);
							break;
						case "SquarePrism":
							allShapes[counter] = new SquarePrism(height, side);
							break;
						case "TriangularPrism":
							allShapes[counter] = new TriangularPrism(height, side);
							break;
						default:
							System.out.println("You have entered an unsupported argument for this program");
							break;
					}
				}
				counter++;
			}

			if (compareBy == 'h' && sortingAlgorithm == 'b') {
				SortingAlgorithms.bubbleSort(allShapes);
			} else if (compareBy == 'h' && sortingAlgorithm == 's') {
				// SortingAlgorithms.selectionSort(allShapes);
			} else if (compareBy == 'h' && sortingAlgorithm == 'i') {
				SortingAlgorithms.insertionSort(allShapes);
			} else if (compareBy == 'h' && sortingAlgorithm == 'm') {
				// SortingAlgorithms.mergeSort(allShapes);
			} else if (compareBy == 'h' && sortingAlgorithm == 'q') {
				// SortingAlgorithms.quickSort(allShapes);
			} else if (compareBy == 'h' && sortingAlgorithm == 'z') {
				// SortingAlgorithms.
			} else if (compareBy == 'v' && sortingAlgorithm == 'b') {
				SortingAlgorithms.bubbleSort(allShapes, new GeometricShapeComparatorV());
			} else if (compareBy == 'v' && sortingAlgorithm == 's') {
				// SortingAlgorithms.selectionSort(allShapes);
			} else if (compareBy == 'v' && sortingAlgorithm == 'i') {
				SortingAlgorithms.insertionSort(allShapes, new GeometricShapeComparatorV());
			} else if (compareBy == 'v' && sortingAlgorithm == 'm') {
				// SortingAlgorithms.mergeSort(allShapes);
			} else if (compareBy == 'v' && sortingAlgorithm == 'q') {
				// SortingAlgorithms.quickSort(allShapes);
			} else if (compareBy == 'v' && sortingAlgorithm == 'z') {
				// SortingAlgorithms.{
			} else if (compareBy == 'b' && sortingAlgorithm == 'b') {
				SortingAlgorithms.bubbleSort(allShapes, new GeometricShapeComparatorB());
			} else if (compareBy == 'b' && sortingAlgorithm == 's') {
				// SortingAlgorithms.selectionSort(allShapes);
			} else if (compareBy == 'b' && sortingAlgorithm == 'i') {
				SortingAlgorithms.insertionSort(allShapes, new GeometricShapeComparatorB());
			} else if (compareBy == 'b' && sortingAlgorithm == 'm') {
				// SortingAlgorithms.mergeSort(allShapes);
			} else if (compareBy == 'b' && sortingAlgorithm == 'q') {
				// SortingAlgorithms.quickSort(allShapes);
			} else if (compareBy == 'b' && sortingAlgorithm == 'z') {
				// SortingAlgorithms.{
			} else {
				System.out.println("Invalid argument");
				System.exit(1);
			}

			for (GeometricShapeADT shape: allShapes) {
				System.out.println(shape);
			}


		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}


	}

}
