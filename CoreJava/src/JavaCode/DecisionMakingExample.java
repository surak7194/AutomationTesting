package JavaCode;

class DecisionMaking 
{
	int i = 10, j= 20;

	void ifstatement() 
	{
		if (i==10 && j==20) 
		{
			System.out.println("value of I is 10 && j is 20");
		}
	}

	void IfElseStatement() 
	{
		int a= 5000;
		if (a<10000)
		{
			System.out.println("fine of Rs.500");
		}
		else 
		{
			System.out.println("you are eligible for loan");
		}
	}
	void IfElseIfStatement() {

		int Bal = 600000;

		if (Bal < 10000) {
			System.out.println("Fine of Rs. 1000");
		} else if (Bal < 100000) {
			System.out.println("Loan eligible Rs. 50k");
		} else if (Bal < 150000) {
			System.out.println("Loan eligible Rs. 1 Lakh");
		} else if (Bal < 200000) {
			System.out.println("Loan eligible Rs. 2 Lakh");
		} else {
			System.out.println("Loan eligible Rs. 5 Lakh");
		}

	}
	void nestedIfStatement() 
	{

		int Bal = 9000;

		if (Bal > 10000)
		{
			if (Bal < 100000) 
			{
				if (Bal < 50000) 
				{
					System.out.println("Loan amount 25k");
				} else 
				{
					System.out.println("Loan amount 50k");
				}
			} 
			else 
			{
				System.out.println("Loan amount 2 Lakh");
			}

		}
		else 
		{
			System.out.println("invalid amount");
		}
	}
	
	
	void switchstatement() 
	{
		String  colour= "voilet";
		switch(colour) 
		{

		case "yellow" : System.out.println("yellow colour");
		break;

		case "green" : System.out.println("green colour");
		break;

		case "red" : System.out.println("red colour");
		break;

		case "black" : System.out.println("black colour");
		break;

		default: System.out.println("colourless life ");

		}

	}

}

public class DecisionMakingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecisionMaking dm= new DecisionMaking();
		//dm.ifstatement();
		//dm.IfElseStatement();

		//dm.IfElseIfStatement();
		//dm.nestedIfStatement();

		dm.switchstatement();
	}

}
