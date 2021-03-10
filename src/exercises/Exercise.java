package exercises;

import java.util.Scanner;

public class Exercise 
{	
	public static void main (String args[])
	{
		//______ arr [] = {65, 3.4, 4.3f}; Fill in the blanks
		float arr [] = {65, 3.4f, 4.3f};

		//Have the user input a number 5 times and print them out in reverse order.
		// Scanner sc = new Scanner(System.in);
		// int[] inputs = new int[5];

		// for (int i=0; i<5; i++)
		// {
		// 	System.out.print("Enter number: ");
		// 	inputs[i] = sc.nextInt();
		// 	sc.nextLine();
		// }

		// for (int i = 4; i >= 0; i--)
		// {
		// 	System.out.println(inputs[i]);
		// }
		
		// sc.close();
		// System.out.println();

		//Create a program that will find an item in an array and print out the index of that time. 
		//If the item is not found, print -1 instead.
		//Example array: {10, 55, 12, 3, 44, -3}
		int[] newArray = {10, 55, 12, 3, 44, -3};
		int itemToCheck = 99;
		int indexFound = -1;

		for (int i=0; i<newArray.length; i++)
		{
			if (itemToCheck == newArray[i])
			{
				indexFound = i;
				break;
			}
		}

		System.out.println("Item found at: " + indexFound);
		

		//Can you change the size of an array during runtime?
		int size = 8;		//from ur user input
		int[] array = new int[size];
		array = new int[size+1];
	}
}
