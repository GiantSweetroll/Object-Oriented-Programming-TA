package demo;

public class Multithreading
{
	public static void main(String args[])
	{
		// Without Multithreading
//		for (int i=0; i < 10; i++)
//		{
//			System.out.println("Process 1: " + i);
//		}
//		for (int a=9; a >= 0; a--)
//		{
//			System.out.println("Process 2: " + a);
//		}
		
		// With Multithreading
		Runnable r1 = new Runnable() {
			public void run()
			{
				for (int i=0; i < 10; i++)
				{
					System.out.println("Process 1: " + i);
				}
			}
		};
		Runnable r2 = new Runnable() {
			public void run()
			{
				for (int a=9; a >= 0; a--)
				{
					System.out.println("Process 2: " + a);
				}
			}
		};
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		while(true)
		{
			if (!t1.isAlive())
			{
				t1 = new Thread(r1);
				
				t1.start();
			}
		}
	}
}
