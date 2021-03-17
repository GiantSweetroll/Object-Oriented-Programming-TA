package exercises;

public class Exercise 
{	
	public static void main (String args[])
	{
		//No1 
		String temp = "420" + "69" + (420 + 69);
		System.out.println(temp);
		
		//No2
		String jude = "mister jude pokemon master";
		String ans = jude.substring(0, 1).toUpperCase() + 
						jude.substring(1, 7) +
						jude.substring(7, 8).toUpperCase() +
						jude.substring(8, 12) +
						jude.substring(12, 13).toUpperCase() +
						jude.substring(13, 20) +
						jude.substring(20, 21).toUpperCase() +
						jude.substring(21);
		System.out.println(ans);
		
		//No 3
		System.out.println(jude.replaceAll(" ", ""));
	}
}
