package demo;

import java.util.ArrayList;

public class Main
{
	
	public static void main (String args[])
	{
		// Using Abstract Classes
		Animal dog = new Dog(3, "Fluffy");
		Animal cat = new Cat(4, "Sprinkle");
		
		dog.eat();
		cat.eat();
		
		// Using Interfaces
		ForestSurvival fs = new Dog(2, "Pupper");
		Drink dr = new Dog(3, "Wolfie");
		Human hm = new Cat(5, "Garfield");
		
		fs.fight();
		fs.hideUnderTree();
		dr.drinkCleanWater();
		
		System.out.println(fs instanceof Animal);
		System.out.println(fs instanceof ForestSurvival);
		System.out.println(fs instanceof Drink);
		System.out.println(fs instanceof Dog);
		System.out.println(fs instanceof Cat);
		System.out.println(Drink.volume);
		
		hm.cry();
		hm.talk();
		
		// Initializing a new abstract class and interface
		Animal animal = new Animal() 
		{
			@Override
			public void eat() 
			{
				System.out.println("Animal eat");
			}
			
		};
		animal.eat();
		
		Human newHuman = new Human() 
		{
			@Override
			public void cry() 
			{
				System.out.println("Custom human cry");
			}

			@Override
			public void talk() 
			{
				System.out.println("Custom human talk");
			}	
		};
		newHuman.cry();
		newHuman.talk();
		
		// Using Abstract class and interface in list
		ArrayList<Human> humans = new ArrayList<Human>();
		for (int i=1; i<=5; i++)
		{
			final int a = i;
			Human human = new Human() 
			{
				@Override
				public void cry() {
					System.out.println("Human " + a + " cry.");
				}

				@Override
				public void talk() {
					System.out.println("Human " + a + " talk.");
					
				}
			};
			humans.add(human);
		}
		
		for (Human human : humans)
		{
			human.cry();
		}
		
		ArrayList<Survival> survivals = new ArrayList<Survival>();
		survivals.add(new Dog(4, "Baxter"));
		survivals.add(new Cat(2, "Cherry"));
		survivals.get(0).fight();
		survivals.get(1).fight();
	}
}