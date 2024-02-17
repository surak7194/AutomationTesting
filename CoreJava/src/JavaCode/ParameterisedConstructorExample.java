package JavaCode;

class PConstructor
{
	PConstructor()
	{
		System.out.println("Constructor without taking any argument");
	}	
	
	PConstructor(int a)
	{
		System.out.println("Constructor without taking int argument");
	}

	PConstructor(int a, float f, String s)
	{
		System.out.println("Constructor without taking int,float,string argument");
	}

	
}

public class ParameterisedConstructorExample {

	public static void main(String[] args) {
		PConstructor pc1 = new PConstructor();
		PConstructor pc2 = new PConstructor(20);
		PConstructor pc3 = new PConstructor(20,88.88f,"Avantika");
		
	}

}
