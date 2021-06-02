package demo;

public class Dog extends Animal implements ForestSurvival, Drink
{
	// Fields
	public boolean haveChasedCars;
	
	// Constructor
	public Dog(int age, String name)
	{
		super(age, name);
		this.haveChasedCars = false;
	}
	
	// Overridden Methods
	@Override
	public void eat() 
	{
		System.out.println("Dog eat");
	}

	@Override
	public void fight() {
		System.out.println("Dog fight");
	}

	@Override
	public void flight() {
		System.out.println("Dog flee");
	}

	@Override
	public void drinkCleanWater() {
		System.out.println("Dog Drink Clean Water");
	}

	@Override
	public void drinkPuddle() {
		System.out.println("Dog Drink Puddle");
	}

	@Override
	public void hideUnderTree() {
		System.out.println("Dog hide under tree :(");
	}
}
