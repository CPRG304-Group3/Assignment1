package appDomain;

import shapes.*;
import utilities.GeometricShapeADT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppDriver
{

	public static void main( String[] args )
	{
		// Initialization of variables for user argument values
		String filename = "";
		char compareBy;
		char sortingAlgorithm;
		int arraySize;

		if (args.length != 3){
			System.out.println("You need to pass 3 arguments (T, F & S)");
			System.exit(0);
		}

		if (args[0].length() <= 3 || args[1].length() <= 2 || args[2].length() <= 2){
			System.out.println("You need to pass data with each argument");
			System.exit(1);
		}

		// Switch cases that store the sort method to use in the program based on the argument given
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


		try (Scanner input = new Scanner(new File(filename))) {
			if (input.hasNextInt()) {
				arraySize = input.nextInt();
				GeometricShapeADT[] geometricShape = new GeometricShapeADT[arraySize];
				int counter = 0;
				while (input.hasNextLine()) {
					String shape = input.next();
					double side1 = input.nextDouble();
					double side2 = input.nextDouble();
					switch (shape) {
						case "Cone":
							geometricShape[counter] = new Cone(side1, side2);
							break;
						case "Cylinder":
							geometricShape[counter] = new Cylinder(side1, side2);
							break;
						case "Pyramid":
							geometricShape[counter] = new Pyramid(side1, side2);
							break;
						case "OctagonalPrism":
							geometricShape[counter] = new OctagonalPrism(side1, side2);
							break;
						case "PentagonalPrism":
							geometricShape[counter] = new PentagonalPrism(side1, side2);
							break;
						case "SquarePrism":
							geometricShape[counter] = new SquarePrism(side1, side2);
							break;
						case "TriangularPrism":
							geometricShape[counter] = new TriangularPrism(side1, side2);
							break;
						default :
							System.out.println("You have entered an unsupported argument for this program");
							break;
					}
					counter++;
				}
				for (GeometricShapeADT shape : geometricShape) {
					System.out.println(shape);
				}
			}
		} catch (FileNotFoundException e){
			System.out.println("File not found");
			System.exit(5);
		}

		// Based on
	}

}
