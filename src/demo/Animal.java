package demo;

public abstract class Animal
{
	// Fields
	public int age;
	public String name;
	
	// Constructor
	public Animal()
	{
		this.age = 0;
		this.name = "";
	}
	
	public Animal(int age, String name)
	{
		this.age = age;
		this.name = name;
	}
	
	// Methods
	public void sleep()
	{
		System.out.println("Sleep.");
	}
	
	public abstract void eat();
}
