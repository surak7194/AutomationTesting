package Assignment;
class calculator
{
	// Function without arg and without return type
	void addition()
	{
		System.out.println("Function without arg and without return type");
	}
	// Function with arg and without return type
	void substraction(int n1, int n2)
	{
		int sub = n1-n2;
		System.out.println("Function with arg and without return type shows sub output :"+ sub);
	}

	// without arg with return type

	int multiplication()
	{
		//System.out.println(" Function without arg with return type");
		int c = 0;
		return c;
	}

	//with arg with return type	

	int division(int n1, int n2)
	{
		int n3 = n1/n2;
		//System.out.println(" Function with arg and with return type result is :" + div);
		return n3;
	}
}
public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c = new calculator();
		c.addition();
		c.substraction(9, 2);
		int s= c.multiplication();
		System.out.println(" Function without arg with return type result is :" + s);

		int d= c.division(16, 4);
		System.out.println("Function with arg and with return type result is :" + d);
	}
}








