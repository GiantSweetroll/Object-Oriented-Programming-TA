
public class Recap
{
	public static void main (String args[])
    {
		//Example of a String
    	System.out.println("String example: ");
    	String name = "Paimon";
    	String name2 = new String("Paimon");
    	System.out.println(name);
    	System.out.println(name2);
    	System.out.println();
    	
    	/**
    	 * length();
    	 * 
    	 * How to use:
    	 * int len = myString.length();
    	 */
    	System.out.println("Length of string: " + name.length());
    	
    	/**
    	 * toUpperCase();
    	 * 
    	 * How to use:
    	 * String upper = myString.toUpperCase();
    	 */
    	System.out.println("Upper case: " + name.toUpperCase());
    	
    	/**
    	 * toLowerCase();
    	 * 
    	 * How to use:
    	 * String lower = myString.toLowerCase();
    	 */
    	System.out.println("Lower case: " + name.toLowerCase());
    	System.out.println();
    	
    	/**
    	 * String concatenation
    	 */
    	System.out.println("String concatenation: ");
    	String str1 = "Vincentius";
    	String str2 = "Bently";
    	
    	//+ operator
    	System.out.println("Using + operator: ");
    	System.out.println(str1 + str2);
    	
    	//concat() method
    	System.out.println("Using concat() method: ");
    	String temp = str2.concat(str1);
    	System.out.println(temp);
    	
    	//using both?
    	temp = str1.concat(" " + str2);
    	System.out.println(temp);
    	System.out.println();
    	
    	/**
    	 * indexOf();
    	 */
    	String string = "I eat apple with apple juice";

    	int index = string.indexOf("juice");		//What will be the value of index?
    	int index2 = string.indexOf("apple");		//What will be the value of index2?
    	int index3 = string.indexOf(" ");			//What will be the value of index3?
    	System.out.println(string.indexOf("jason"));
    	System.out.println();
    	
    	/**
    	 * substring();
    	 */
    	String txt = "reception";
    	
    	String txt2 = txt.substring(1);
    	String txt3 = txt.substring(1, 4);
    	String txt4 = txt.substring(0, 9);
    	
    	System.out.println(txt.length());
    	System.out.println(txt4);
    	
    	//Special Characters
    	String viking = "We are \n the so-called \"Vikings\" from the north.";
    	System.out.print(viking + "\n");
    	System.out.println("Gardyan Herman Martinez");
    	System.out.println();
    	
    	//String Comparison
    	System.out.println("String Comparison: ");
    	String j1 = "Jude";
    	String j2 = "Jude";
    	String j3 = new String("jude");
    	
    	System.out.println(j1.equalsIgnoreCase(j3));
    	
    	System.out.println("Using compareTo()");
    	String j4 = "Juda";
    	System.out.println(j1.compareTo(j4));
    }
}
