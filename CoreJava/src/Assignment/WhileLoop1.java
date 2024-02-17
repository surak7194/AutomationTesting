/*
//1. Print a Even-Odd number program using While Loop (1 to 10)
package Assignment;

class A
{
	void EvenOdd()
	{
		System.out.println("Even no. are: ");

		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}

		System.out.println("Odd no. are: ");
		int j=1;
		while(j<=10)
		{
			if(j%2!=0)
			{
				System.out.println(j);
			}
			j++;
		}
	}
}
public class WhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.EvenOdd();
	}

}*/




//1. Print a Even-Odd number program using While Loop (1 to 10)
package Assignment;

class A
{
	void Even()
	{
		System.out.println("Even no. are: ");

		int i=1;
		while(i<=20)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	
	void Odd()
	{
		System.out.println("Odd no. are: ");

		int i=1;
		while(i<=20)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}
	}


}
public class WhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.Even();
		a.Odd();
	}

}


