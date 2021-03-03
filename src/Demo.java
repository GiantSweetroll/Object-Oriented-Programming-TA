public class Demo 
{
    public static void main (String args[])
    {
    	////If statement
    	/*
    	  Syntax:
    	  
    	  if (condition1) {
			   //Your code 1
			}
			else if (condition2) {
			   //Your code 2
			}
			else {
			  //Your code 3
			}
    	 */
    	int n = 24;
    	if (n<20)
    	{
    		System.out.println("Number is less than 20");
    	}
    	else if (n > 30)
    	{
    		System.out.println("Number is greater than 30");
    	}
    	else
    	{
    		System.out.println("Number is between 20 and 30");
    	}
    	
    	
    	////Switch statement
    	/*
    	   Syntax:
    	  
    	   switch (item) {
			   case firstCase:
			      //Your code 1
			   break;
			    
			    case secondCase:
			      //Your code 2
			    break;
			  
			    default:
			      //Your code 3
			    break;
			}
    	 */
    	int n2 = 30;
    	switch(n2)
    	{
	    	case 20:
	    		System.out.println("Hello I am 20");
	    		break;
	    		
	    	case 30:
	    		System.out.println("Hello I am 30");
	    		break;
    		
    		default:
    			System.out.println("Hello I am something else");
    			break;
    	}
    	
    	//If statement equivalent
    	if (n2 == 20)
    	{
    		System.out.println("Hello I am 20");
    	}
    	else if (n2 == 30)
    	{
    		System.out.println("Hello I am 30");
    	}
    	else
    	{
    		System.out.println("Hello I am something else");
    	}
    	
    	////For loops
    	/*
    	   Syntax:
    	  
    	   for (int i=0; i<5; i++) {
			    //Your code here
			}
    	 */
    	for (int i = 1; i <= 5; i++)
    	{
    		System.out.println(i);
    	}
    	
    	////While loop
    	/*
    	   Syntax:
    	  
    	   while (condition) {
			    //Your code here
			}
    	 */
    	System.out.println("Using While loop");
    	int i=1;
    	while (i == 0)
    	{
    		System.out.println(i);
    		i++;
    	}
    	System.out.println();
    	
    	////Do While loop
    	/*
    	   Syntax:
    	  
    	   do {
			    //Your code here
			} while (condition);

    	 */
    	System.out.println("Using Do-While loop");
    	int a = 1;
    	do 
    	{
    		System.out.println(a);
    		a++;
    	} while (a == 0);
    }    
}
