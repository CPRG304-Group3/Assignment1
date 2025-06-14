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

		switch (args[0].charAt(1)){
			case 'T', 't' :
				compareBy = args[0].charAt(2);
				break;
			case 'F', 'f' :
				filename = args[0].substring(2);
				break;
			case 'S', 's':
				sortingAlgorithm =  args[0].charAt(2);
				break;
			default :
				System.out.println("You have entered an unsupported argument for this program");
				System.exit(2);
		}

		switch (args[1].charAt(1)){
			case 'T', 't' :
				compareBy = args[1].charAt(2);
				break;
			case 'F', 'f' :
				filename = args[1].substring(2);
				break;
			case 'S', 's':
				sortingAlgorithm =  args[1].charAt(2);
				break;
			default :
				System.out.println("You have entered an unsupported argument for this program");
				System.exit(3);
		}

		switch (args[2].charAt(1)){
			case 'T', 't' :
				compareBy = args[2].charAt(2);
				break;
			case 'F', 'f' :
				filename = args[2].substring(2);
				break;
			case 'S', 's':
				sortingAlgorithm =  args[2].charAt(2);
				break;
			default :
				System.out.println("You have entered an unsupported argument for this program");
				System.exit(4);
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
			}
		} catch (FileNotFoundException e){
			System.out.println("File not found");
			System.exit(5);
		}

	}

}
