
public class Scope 
{
	static int n = 1;
	
	public static void main(String args[])
	{
		n++;
		int nLocal = 2;
	}
	
	public static void m1()
	{
		n++;
		int nLocalM1 = 3;
	}
	
	public static void m2()
	{
		n++;
		int nLocalM2 = 4;
	}
}
