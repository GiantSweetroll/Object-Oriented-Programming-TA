package input;

import java.util.Scanner;

public class ScannerDemo
{
	public static void main(String args[])
	{
		// Using Scanner for Getting Input from User 
        // Scanner in = new Scanner(System.in); 
  
        // String s = in.nextLine(); 
        // System.out.println("You entered string " + s); 
  
        // int a = in.nextInt(); 
        // System.out.println("You entered integer " + a); 
  
        // float b = in.nextFloat(); 
        // System.out.println("You entered float " + b); 

        //////////////////////////////////////////////////
        Scanner in = new Scanner(System.in);

        System.out.print("Please input your name: ");
        String name = in.nextLine();
        
        System.out.println("Your name is: " + name);

        in.close();
	}
}
