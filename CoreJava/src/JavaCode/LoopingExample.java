package JavaCode;

class LoopingTypes
{
	void forLoop()
	{
		int i;
		
	 	// print 1 to 10
			for(i=1; i<=10; i++) 
		{
			System.out.println("values of i: " + i);
		}
		System.out.println("after loop i value: " + i);

		// increment by 2
		for(i=1; i<=10; i+=2) 
		{
			System.out.println("values of i: " + i);
		}
		System.out.println("after loop i value: " + i);
		 

		// Even and odd
		for(i=1; i<=10; i++) 
		{
			if(i%2==0)
			{
				System.out.println("even number value: " + i);
			}
			//if(i%2!=0) {
				//System.out.println("odd number value: " + i);
			//}
			else 
			{
				System.out.println("odd no value: " + i);
			}
		}
			
		// Reverse order 10 to 1
		for(i=10; i>=0; i--) 
		{
			System.out.println("value of i " + i);
		}
	}
	
	void whileLoop() 
	{
		int i= 1;
		
		while(i<=10) 
		{
			System.out.println("value of I: " + i);
			i++;
		}
	}
	void doWhileLoop()
	{
		int i=1;
		do 
		{
			System.out.println("the value of dowhileloop:" + i);
			i++;			
		}
		while(i<=10);
	
		
		
	}
	
}
public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopingTypes lt= new LoopingTypes();
		//lt.forLoop();
		//lt.whileLoop();
		lt.doWhileLoop();
	}

}
