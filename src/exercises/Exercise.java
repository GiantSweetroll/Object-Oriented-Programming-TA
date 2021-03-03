package exercises;

import java.util.Scanner;

public class Exercise 
{	
	public static void main (String args[])
	{
		///Have the user input a number and check if that number is even or odd
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a number: ");
		int n = sc.nextInt();
		sc.nextLine();
		if (n % 2 == 0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		sc.close();//Close the input stream (to prevent memory leak)
		
		///Print your name 5 times using a while loop
		int i=1;
		while (i <= 5)
		{
			System.out.println("Gardyan");
			i++;
		}
		
		///Print the numbers 7, 8, 9, 10, 11, and 12 using a do while loop (in that order)
		int b = 7;
		do
		{
			System.out.println(b);
			b++;
		} while (b <= 12);
		
		///Print the numbers 5, 4, 3, 2, and 1 using a for loop (in that order)
		for (int c=5; c >= 1; c--)
		{
			System.out.println(c);
		}
	}
}
