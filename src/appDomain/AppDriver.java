/**
 * Program: Assignment 1 - Sort Shapes
 * Description: Program is a sorting program that sorts a list of shapes given by user through the command line
 * 				which expects 3 arguments to decide which shapes to load into the program and then later sort.
 * 				Command line arguments include one of each: file, comparison type and sorting algorithm.
 * 				Sorting algorithm is chosen from utilities based on one of the arguments with either comparable
 * 				that is implemented in each shape or a Comparator class.
 * Author: Chioma Eme, Merilyne Mbong
 * Date: June 20th, 2025
 */
package appDomain;

import shapes.*;
import utilities.GeometricShapeADT;
import utilities.GeometricShapeComparatorB;
import utilities.GeometricShapeComparatorV;
import utilities.SortingAlgorithms;

import java.io.*;

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

		// Try loading the shapes into an array.
		try (BufferedReader input = new BufferedReader(new FileReader(filename))) {
			String line;
			int counter = 0;

			// Shape array creation with initialization of size based on first line of file
			// If file does not contain first line of an integer, a runtime error will occur.
			GeometricShapeADT[] allShapes = new GeometricShapeADT[Integer.parseInt(input.readLine())];

			// Read values per line while a line exists in the file and add to array based on shape in file
			// Out of Memory Error (Java heap space) occurs when attempting to load the shapesBig.txt
			String[] lineValues = null;
			String specifiedShape;
			double height = 0;
			double side = 0;
			while ((line = input.readLine()) != null) {
				lineValues = line.split(" ");
				if (lineValues.length == 3) {
					specifiedShape = lineValues[0];
					height = Double.parseDouble(lineValues[1]);
					side = Double.parseDouble(lineValues[2]);
					switch (specifiedShape) {
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

			// Once all shapes have been loaded into the array, sort based on given arguments
			long start = System.nanoTime();
			if (compareBy == 'h' && sortingAlgorithm == 'b') {
				SortingAlgorithms.bubbleSort(allShapes);
			} else if (compareBy == 'h' && sortingAlgorithm == 's') {
				SortingAlgorithms.selectionSort(allShapes);
			} else if (compareBy == 'h' && sortingAlgorithm == 'i') {
				SortingAlgorithms.insertionSort(allShapes);
			} else if (compareBy == 'h' && sortingAlgorithm == 'm') {
				SortingAlgorithms.mergeSort(allShapes);
			} else if (compareBy == 'h' && sortingAlgorithm == 'q') {
				SortingAlgorithms.quickSort(allShapes, 0, allShapes.length - 1);
			} else if (compareBy == 'h' && sortingAlgorithm == 'z') {
				SortingAlgorithms.heapSort(allShapes);
			} else if (compareBy == 'v' && sortingAlgorithm == 'b') {
				SortingAlgorithms.bubbleSort(allShapes, new GeometricShapeComparatorV());
			} else if (compareBy == 'v' && sortingAlgorithm == 's') {
				SortingAlgorithms.selectionSort(allShapes, new GeometricShapeComparatorV());
			} else if (compareBy == 'v' && sortingAlgorithm == 'i') {
				SortingAlgorithms.insertionSort(allShapes, new GeometricShapeComparatorV());
			} else if (compareBy == 'v' && sortingAlgorithm == 'm') {
				SortingAlgorithms.mergeSort(allShapes, new GeometricShapeComparatorV());
			} else if (compareBy == 'v' && sortingAlgorithm == 'q') {
				SortingAlgorithms.quickSort(allShapes, new GeometricShapeComparatorV(), 0,  allShapes.length - 1);
			} else if (compareBy == 'v' && sortingAlgorithm == 'z') {
				SortingAlgorithms.heapSort(allShapes, new GeometricShapeComparatorV());
			} else if (compareBy == 'b' && sortingAlgorithm == 'b') {
				SortingAlgorithms.bubbleSort(allShapes, new GeometricShapeComparatorB());
			} else if (compareBy == 'b' && sortingAlgorithm == 's') {
				SortingAlgorithms.selectionSort(allShapes, new GeometricShapeComparatorB());
			} else if (compareBy == 'b' && sortingAlgorithm == 'i') {
				SortingAlgorithms.insertionSort(allShapes, new GeometricShapeComparatorB());
			} else if (compareBy == 'b' && sortingAlgorithm == 'm') {
				SortingAlgorithms.mergeSort(allShapes, new GeometricShapeComparatorB());
			} else if (compareBy == 'b' && sortingAlgorithm == 'q') {
				SortingAlgorithms.quickSort(allShapes, new GeometricShapeComparatorB(), 0, allShapes.length - 1);
			} else if (compareBy == 'b' && sortingAlgorithm == 'z') {
				SortingAlgorithms.heapSort(allShapes, new GeometricShapeComparatorB());
			} else {
				System.out.println("Invalid sorting algorithm or comparison type provided");
				System.exit(1);
			}
			long stop = System.nanoTime();

			// Prints out the first and every thousandth shape position once sorted
			for (int i = 0; i < allShapes.length; i += 1000) {
				if (compareBy == 'h') {
					if (i == 0) {
						System.out.printf("First element is: %40s %30s %f\n", allShapes[i].getClass(),  "Height: ", allShapes[i].getHeight());
					} else {
						System.out.printf("%d-th element: %41s %30s %f\n", i, allShapes[i].getClass(),  "Height: ", allShapes[i].getHeight());
					}
				} else if (compareBy == 'v') {
					if (i == 0) {
						System.out.printf("First element is: %40s %30s %f\n", allShapes[i].getClass(),  "Volume: ", allShapes[i].calcVolume());
					} else {
						System.out.printf("%d-th element: %41s %30s %f\n", i, allShapes[i].getClass(),  "Volume: ", allShapes[i].calcVolume());
					}
				} else {
					if (i == 0) {
						System.out.printf("First element is: %40s %30s %f\n", allShapes[i].getClass(),  "Area: ", allShapes[i].calcBaseArea());
					} else {
						System.out.printf("%d-th element: %41s %30s %f\n", i, allShapes[i].getClass(),  "Area: ", allShapes[i].calcBaseArea());
					}
				}
			}

			// Based on compare type, the last element is printed
			switch (compareBy) {
				case 'h' :
					System.out.printf("Last element is: %41s %30s %f\n", allShapes[allShapes.length - 1].getClass(),
							"Height: ", allShapes[allShapes.length - 1].getHeight());
					break;
				case 'v' :
					System.out.printf("Last element is: %41s %30s %f\n", allShapes[allShapes.length - 1].getClass(),
							"Volume: ", allShapes[allShapes.length - 1].calcVolume());
					break;
				case 'b' :
					System.out.printf("Last element is: %41s %30s %f\n", allShapes[allShapes.length - 1].getClass(),
							"Area: ", allShapes[allShapes.length - 1].calcBaseArea());
					break;
				default :
					System.out.println("Invalid comparison type provided");
					break;
			}

			// Based on sorting algorithm chosen, prints the run time taken to for sorting to happen in milliseconds.
			switch (sortingAlgorithm) {
				case 'b':
					System.out.print("Bubble Sort run time was: ");
					break;
				case 'i':
					System.out.print("Insertion Sort run time was: ");
					break;
				case 's':
					System.out.print("Selection Sort run time was: ");
					break;
				case 'q':
					System.out.print("Quick Sort run time was: ");
					break;
				case 'm':
					System.out.print("Merge Sort run time was: ");
					break;
				case 'z':
					System.out.print("Chosen (Heap) Sort run time was: ");
					break;
				default:
					System.out.println("Invalid sorting algorithm or comparison type provided");
					break;
			}
			System.out.println((stop - start)/1000000 + " milliseconds");

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}


	}

}
