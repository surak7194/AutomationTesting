//3. Print a Even-Odd number program using Do-While Loop (1 to 10)

package Assignment;

class C 
{
	void even()
	{
		System.out.println("Even Numbers are:");
		int i=1;
		do
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}while(i<=10);
		
		System.out.println("Odd Numbers are:");
		int j=1;
		do
		{
			if(j%2!=0)
			{
				System.out.println(j);
			}
			j++;
		}while(j<=10);
		
	}
	
}

public class DoWhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      C c = new C();
      c.even();
      //c.odd();
	}

}
