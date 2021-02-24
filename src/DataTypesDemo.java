
public class DataTypesDemo 
{
	public static void main(String[] args) 
	{
		int myAge = 19;
		double myAgeDouble = 19.0d;
		float myAgeFloat = 19.0f;
		boolean isMale = true;
		
		System.out.println(myAge);
		myAge *= 2;
		System.out.println(myAge);

		int number = 2;
		number = (int)Math.pow(number, 4);
		System.out.println("Exponential number: " + number);

		String name = "Gardyan";
		//GardyanGardyanGardyanGardyan
		name = name + name + " Akbar";
		System.out.println(name);

		number = 3;
		number++;	//Returns the number first, and then add by 1
		System.out.println(number++);

		///////////////////////////////////////////
		int age = 19;
		// int newAge = ++age;		//Adds by 1 first, and then return the value
		int newAge = age++;		//Return the value of age first, and then it adds by 1
		System.out.println("Next birthday I will be: " + newAge);
		System.out.println("Actual age: " + age);

		////////////////////////////////////////////
		System.out.println();
		System.out.println("Hello");
		System.out.println("There");
		System.out.print("Hello");
		System.out.print("There");
		/////////////////////////////////////////////
		System.out.println();
		int n = 2;
		int s = n;
		n++;
		System.out.println(n);
		System.out.println(s);
	}
}
