package demo;

public class Cat extends Animal
{
	// Constructors
	public Cat()
	{
		super("Cat", 4, 'f');
	}
	public Cat(String name, char sex)
	{
		super(name, 4, sex);
	}
	
	// Overridden Methods
	@Override
	public void eat()
	{
		System.out.println(this.name + " meows and eats something...");
	}
}
