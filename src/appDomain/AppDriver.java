package appDomain;

public class AppDriver
{

	public static void main( String[] args )
	{
		String filename;
		char compareBy;
		char sortingAlgorithm;

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

	}

}
