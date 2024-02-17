package JavaCode;

class Constructor
{

	Constructor()
	{
		System.out.println("New Constructor is called....!");
	}
	
	void show() {
		System.out.println("This is show method ");
	}
}

public class ConstructorExample {

	public static void main(String[] args) 
	{
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor();
		Constructor c3 = new Constructor();
        Constructor c = new Constructor();
           c.show();
	}

}
