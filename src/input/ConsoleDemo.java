package input;

//Java program to demonstrate working of System.console() 
//Note that this program does not work on IDEs as 
//System.console() may require console 
public class ConsoleDemo 
{
	public static void main(String args[])
	{
		String name = System.console().readLine(); 
		
		System.out.println("You entered string " + name); 
	}
}
