package exercises;
import java.util.Scanner;

public class PlanetaryWeight 
{
	public static void main(String args[])
	{
		//Initialize variables
		float mass = 0f;
		float gravity = 0f;
		float weight = 0f;
		
		Scanner sc = new Scanner(System.in);		//Used to get user input
		
		//Get mass
		System.out.print("Enter your mass (kg): ");
		mass = sc.nextFloat();		//Get the user input as a float
		
		sc.nextLine();		//Move to new line
		
		//Get acceleration
		System.out.print("Enter the gravitational acceleration of the planet (m/s^2): ");
		gravity = sc.nextFloat();
		
		sc.close();		//We do not need to get any more inputs, so we close the stream
		
		//Calculate the weight
		weight = mass * gravity;
		
		System.out.println("Your weight is: " + weight);		//Print to console
	}
}
