//4. Print number's in reverse order 10 to 1 using Do-While loop

package Assignment;

class D
{
	void reverse()
	{
		System.out.println("Rev Numbers are:");
		int i=10;
		do
		{
			
				System.out.println(i);
			
			i--;
		}while(i>=1);
	}
}

public class DoWhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   D d = new D();
   d.reverse();
	}

}
