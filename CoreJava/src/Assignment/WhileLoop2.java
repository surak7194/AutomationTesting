//2. Print number's in reverse order 10 to 1 using While loop

package Assignment;

class B 
{
	void ReverseNum()
	{
		System.out.println("Reverse Numbers:");
		int i=10;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
	}
}

public class WhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B a = new B();
       a.ReverseNum();
	}

}
