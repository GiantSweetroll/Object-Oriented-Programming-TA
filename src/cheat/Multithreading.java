package cheat;

public class Multithreading 
{
	public static void main(String args[])
	{
		// Without multithreading
		System.out.println("Without multithreading:");
		for (int i=0; i < 10; i++)
		{
			System.out.println("Process 1: " + i);
		}
		
		for (int a=9; a >= 0; a--)
		{
			System.out.println("Process 2: " + a);
		}
		System.out.println();
		
		// With multitheading
		System.out.println("With multithreading:");
		Thread t1 = new Thread(new Runnable()
				{
					public void run()
					{
						for (int i=0; i < 10; i++)
						{
							System.out.println("Process 1: " + i);
							try {
								Thread.sleep(50);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				});
		Thread t2 = new Thread(new Runnable()
				{
					public void run()
					{
						for (int a=9; a >= 0; a--)
						{
							System.out.println("Process 2: " + a);
							try {
								Thread.sleep(10);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				});
		
		// Start thread
		t1.start();
		t2.start();
		
		// restart
		int i=0;
		while (i < 10000)
		{
			if (!t2.isAlive())
			{
				t2 = new Thread(new Runnable()
				{
					public void run()
					{
						for (int a=9; a >= 0; a--)
						{
							System.out.println("Process 2: " + a);
							try {
								Thread.sleep(10);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				});
				t2.start();
			}
		}
	}
}
