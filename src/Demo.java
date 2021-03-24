import java.util.ArrayList;
import java.util.Vector;

public class Demo 
{
    public static void main (String args[])
    {
//    	int[] arr = {1, 4, 2};
//    	ArrayList<Integer> arrA = new ArrayList<>();
//    	Vector<Integer> arrV = new Vector<>();
//    	
//    	//How to add values in ArrayList
//    	arrA.add(1);
//    	arrA.add(4);
//    	arrA.add(2);
//    	
//    	//How to add values in Vector
//    	arrV.addElement(1);
//    	arrV.add(4);
//    	arrV.addElement(2);
//    	
//    	//How to get value
//    	System.out.println(arrV.get(1));	//arr[0]
//    	
//    	//Remove
//    	arrA.remove(1);
//    	System.out.println(arrA.size());
    	
    	//Parameter passing using primitive
    	int a = 1;
    	int b = 2;
    	print("Before funnyAdd: Value of a: " + a + ", value of b: " + b);
    	int res = funnyAdd(a, b);
    	print("After funnyAdd: Value of a: " + a + ", value of b: " + b);
    	System.out.println(res);
    	print("");
    	
    	//Parameter passing using a non-primitive
    	ArrayList<Integer> ls = new ArrayList<>();
    	ls.add(1);
    	ls.add(2);
    	print("Before funnyAdd: value of b: " + ls.get(1));
    	funnyAdd(ls);
    	print("After funnyAdd: value of b: " + ls.get(1));
    }
    
    static void print(Object obj)
    {
    	System.out.println(obj);
    }
    
    static void funnyAdd(ArrayList<Integer> list)
    {
    	list.set(1, 4);
    	print("DURING funnyAdd: value of b: " + list.get(1));
    }
    
    static int funnyAdd(int a, int b)
    {
    	a++;
    	b+=2;
    	print("DURING funnyAdd: Value of a: " + a + ", value of b: " + b);
    	
    	return a + b;
    }
    
    static int add(int a, int b)
    {
    	return a + b;
    }
}