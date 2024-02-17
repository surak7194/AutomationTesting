
package JavaCode;

class JumpStatement
{
	void Break() 
	{
		System.out.println("Break jump statement values are");
		for(int i=1; i<=10; i++)
		{
			if(i==5) 
			{
				break;
			}
			System.out.println(i);
		}
	}

	void Continue() 
	{
		System.out.println("continue jump statement values are");
		for(int i=1; i<=10; i++)
		{
			if(i==5) 
			{
				continue;
			}
			System.out.println(i);
		}
	}
}

    public class JumpStatementExample 
    {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		JumpStatement js= new JumpStatement();
		js.Break();
		js.Continue();

	}
   }




/*
package JavaCode;

public class JumpStatementExample {

	public static void main(String[] args) {


		//Break statement example


		for(int i=1;i<=10;i++) {

			if(i==5) {
				break;
			}

			System.out.println("Value of I: " + i);
		}

		// Continue statement example

		for(int i=1;i<=10;i++) {

			if(i==5) {
				continue;
			}

			System.out.println("Value of I: " + i);
		}

	}

}
 */
