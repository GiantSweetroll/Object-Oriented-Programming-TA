package demo;

public class Animal 
{
	// Fields
	public String name;
	public int legCount;
	public char sex;
	
	// Constructors
	public Animal()
	{
		this.name = "Animal";
		this.legCount = 4;
		this.sex = 'f';
	}
	public Animal(String name, int legCount, char sex)
	{
		this.name = name;
		this.legCount = legCount;
		this.sex = sex;
	}
	
	// Public Methods
	public void eat()
	{
		System.out.println(this.name + " eats something...");
	}
	public void eat(String foodName)
	{
		System.out.println(this.name + " eats " + foodName + "...");
	}
	
	public static void sleep()
	{
		System.out.println("Sleep time...");
	}
	
	// Private Methods
	private void privateStuff()
	{
		System.out.println(this.name + " is doing some private stuff...");
	}
}
