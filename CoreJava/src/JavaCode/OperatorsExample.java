package JavaCode;
class Operators 
{
	int a= 10;
	void prefixIncrement() 
	{
		System.out.println("prefix increment value of a: " + ++a);
	}
	void postfixIncrement() 
	{
		System.out.println("postfix increment value of a: " + a++);
		System.out.println("updatable value after postfix: " + a);
	}
	void prefixDecrement() {
		System.out.println("prefix Decrement value of a: " + --a);
	}
	void postfixDecrement() 
	{
		System.out.println("postfix Decrement value of a: " + a--);
		System.out.println("updatable value after postfix: " + a);
	}
	void ArithmaticOperator() 
	{
		int a= 10, b= 3;
		System.out.println("Remainder using % operator : " + (a%b));
		System.out.println("addition using + operator : " + (a+b));
		System.out.println("subtraction using - operator : " + (a-b));
		System.out.println("multiplication using * operator : " + (a*b));
		System.out.println("division using / operator : " + (a/b));
	}
	void relationalOperater() 
	{
		int i=10;
		if(i < 11) {
			System.out.println("Strictly less than");
		}
		if(i <= 10) {
			System.out.println("Less than or equal to");
		}
		if(i > 9) {
			System.out.println("Strictly greater than");
		}
		if(i >= 10) {
			System.out.println("Greater than or equal to");
		}
		if (i == 10) {
			System.out.println("Is equal to");
		}
		if (i != 11) {
			System.out.println("Is not equal to");
		}
	}
	void logicalOperater() 
	{
		int a=10, b=20;
		if(a==10 && b==20) 
		{
			System.out.println("Both conditions are True using && Operater");
		}
		if(a==10 || b==20)
		{
			System.out.println("Any one condition is True using || Operater");
		}
	}
	void ternaryOperater() {
		int a=30, b;
		b = a<20 ? 100 : 200;
		System.out.println("Value of b: " + b);
	}
	void assignmentOperater() {
		int a=10;
		a+=10; // a = a + 10
		System.out.println("Result of += : " + a);
	}
}
public class OperatorsExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Operators opt = new Operators();
		opt.prefixIncrement();
		opt.postfixIncrement();
		opt.prefixDecrement();
		opt.postfixDecrement();
		opt.ArithmaticOperator();
		opt.relationalOperater();
		opt.logicalOperater();
		opt.ternaryOperater();
		opt.assignmentOperater();
	}
}



