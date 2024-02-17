
package JavaCode;

class MethodType {

	// Without Return Type, Without Argument

	void withoutReturnWithoutArg() {
		System.out.println("Without Return Type, Without Argument");
	}

	// Without Return Type, With Argument

	void withoutReturnWithArg(int rollNo, String name) {
		System.out.println("Without Return Type, With Argument");
		System.out.println("Roll no: " + rollNo);
		System.out.println("Name: " + name);
	}

	// With Return type, Without Argument

	String withReturnWithoutArg() {
		System.out.println("With Return type, Without Argument");
		return "John";
	}


	// With Return type, With Argument

	int withReturnWithArg(int RollNo, int age) {
		System.out.println("With Return type, With Argument");
		System.out.println("Roll no: " + RollNo);
		System.out.println("age: " + age);
		return age;
	}

}

public class MethodTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodType mt = new MethodType();

		mt.withoutReturnWithoutArg();

		mt.withoutReturnWithArg(101, "John");

		String name = mt.withReturnWithoutArg();
		System.out.println("Retuned name: " + name);

		int age = mt.withReturnWithArg(101, 25);
		System.out.println("Retuned age: " + age);
	}

}
