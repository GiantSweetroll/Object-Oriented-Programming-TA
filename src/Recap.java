import java.util.Scanner;

public class Recap
{
	public static void main(String args[])
	{
		////Declaring and initializing a variable
		/*
		 * Syntax:
		 * dataType varName;			--> Declaring
		 * dataType varName = value; 	--> Initialization
		 */
		int number = 12;
		double myDouble = 12.3;
		float myFloat = 12.3f;
		String myName = "Gardyan";
		
		////User Input
		/*
		 * Scanner
		 * BufferedReader
		 */
		System.out.println(myName);
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();
		sc.nextDouble();
		sc.nextFloat();
		sc.nextByte();
		sc.nextLong();
		sc.nextLine();
		
		sc.close();
	}
}
