package demo;

public class Main
{
	public static void main (String args[])
	{
		// Inheritance example
		Animal a = new Animal();
		Animal c = new Cat();
		Animal d = new Dog();
		
		a.eat();
		a.eat("chicken");
		
		System.out.println();
		
		c.eat();
		c.eat("fish");
		
		System.out.println();
		
		
		d.eat();
		d.eat("bone");
		
		System.out.println();
		
		// Static Binding Example
		a.sleep();
		d.sleep();
		
		System.out.println();
		
//		// Dynamic Binding Example
		a.eat();
		c.eat();
	}
}
