package demo;

public class Cat extends Animal implements Survival, Human, Breathing
{
	// Fields
	public boolean haveMeowed;
	
	// Constructor
	public Cat(int age, String name)
	{
		super(age, name);
		this.haveMeowed = false;
	}
	
	@Override
	public void eat() 
	{
		System.out.println("Cat eat");
	}

	@Override
	public void cry() {
		System.out.println("Cat cry");
	}

	@Override
	public void talk() {
		System.out.println("Cat talk");
	}

	@Override
	public void fight() {
		System.out.println("Cat fight");
	}

	@Override
	public void flight() {
		System.out.println("Cat flee");
	}
}

