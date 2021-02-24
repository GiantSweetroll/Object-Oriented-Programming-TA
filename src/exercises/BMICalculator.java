package exercises;
import java.util.Scanner;

public class BMICalculator 
{
	public static void main(String args[])
	{
		//Initialize variables
		float height = 0f;
		float weight = 0f;
		float bmi = 0f;
		
		Scanner sc = new Scanner(System.in);		//Used to get user input
		
		//Get height
		System.out.print("Enter your height (m): ");
		height = sc.nextFloat();		//Get the user input as a float
		
		sc.nextLine();		//Move to new line
		
		//Get weight
		System.out.print("Enter your weight (kg): ");
		weight = sc.nextFloat();
		
		sc.close();		//We do not need to get any more inputs, so we close the stream
		
		//Calculate the bmi
		bmi = (float)(weight / (Math.pow(height, 2d)));
		
		//Output BMI result
		String result = "";
		if (bmi < 18.5f)
		{
			result = "Underweight";
		}
		else if (bmi <= 25f)
		{
			result = "Normal Weight";
		}
		else if (bmi <= 30)
		{
			result = "Overweight";
		}
		else
		{
			result = "Obese";
		}
		System.out.println("You are " + result);		//Print to console
		
	}
}
