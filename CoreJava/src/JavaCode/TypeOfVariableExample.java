package JavaCode;


class TypeOfVariable {

	// Data Member's

	int rollNo=10; // Instance variable's

	String name="Meera"; // Instance variable's

	final int b=15; // Final variable

	static int s = 100;

	// Member function's

	void show() {

		int a = 25;
		System.out.println("Local variable a: " + a);

	}

	void display() {
		int a=5000;
		System.out.println("Local variable a: " + a);
	}

}

public class TypeOfVariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TypeOfVariable t1 = new TypeOfVariable();
		System.out.println("Instance variable rollNo: " + t1.rollNo);

		t1.show();
		t1.display();

		System.out.println("Final variable b: " + t1.b);


		System.out.println("Static variable s using Object: " + t1.s);
		System.out.println("Static variable s using classname: " + TypeOfVariable.s);


	}

}
