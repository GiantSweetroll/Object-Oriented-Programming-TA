package demo;

public class Dog extends Animal
{
	// Constructors
	public Dog()
	{
		super("Dog", 4, 'm');
	}
	public Dog(String name, char sex)
	{
		super(name, 4, sex);
	}
	public Dog(char name, char sex)
	{
		//lsckascdnsvkjsn
	}
	
	// Public Methods
	public void bark()
	{
		System.out.println("Barking noises...");
	}
	
	public static void sleep()
	{
		System.out.println("Bark and sleep time...");
	}
}
