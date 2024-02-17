package JavaCode;

class AccessModifiers {
	int a= 200;
	public int b= 20;
	private int c= 30;
	protected int d= 40;

	void printPrivateVariable () {
		//System.out.println(a);
		//System.out.println(b);
		System.out.println("Accessing Private Access modifier c: " + c);

	}
}
public class AccessModifierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers am= new AccessModifiers();

		System.out.println("Accessing default access modifier a: " + am.a);
		System.out.println("Accessing Public Access modifier b: " + am.b);

		am.printPrivateVariable();

		System.out.println("Accessing Protected Access modifier :d " + am.d);

	}

}
