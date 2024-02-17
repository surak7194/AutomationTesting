package JavaCode;

class StaticVariable {
	
	int a=10; // Non Static variable
	static int b=20; // Static variable
}

public class StaticVariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariable S1 = new StaticVariable();
		StaticVariable S2 = new StaticVariable();
		StaticVariable S3 = new StaticVariable();
		
		System.out.println("Variable a using Object S1: " + S1.a); // 10
		System.out.println("Variable a using Object S2: " + S2.a); // 10
		System.out.println("Variable a using Object S3: " + S3.a); // 10
		
	/*	S1.a = 100;
		
		System.out.println("Variable a using Object S1: " + S1.a); // 100
		System.out.println("Variable a using Object S2: " + S2.a); // 10
		System.out.println("Variable a using Object S3: " + S3.a); // 10
		
		System.out.println("Static Variable b using Object S1: " + S1.b); // 20
		System.out.println("Static Variable b using Object S2: " + S2.b); // 20
		System.out.println("Static Variable b using Object S3: " + S3.b); // 20
		
		StaticVariable.b = 200;
		
		System.out.println("Static Variable b using Object S1: " + S1.b); // 200
		System.out.println("Static Variable b using Object S2: " + S2.b); // 200
		System.out.println("Static Variable b using Object S3: " + S3.b); // 200
		*/
	}

}
