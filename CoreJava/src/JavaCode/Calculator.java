package JavaCode;

/*public class Calculator {
	
    //  addition method
    public int addition(int a, int b) {   
        return a + b;
    }

  //  subtraction method
    public int subtraction(int a, int b) {
        return a - b;
    }

    //  division method
    public int division(int a, int b) {
        
            return a / b;     
    }

    // multiplication method
    public int multiplication(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        //  object of the Calculator class
    	
        Calculator cal = new Calculator();

        // Calling the addition() method
        int resultAddition = cal.addition(1, 5);
        System.out.println("Addition Result: " + resultAddition);

        // Calling the subtraction() method
        int resultSubtraction = cal.subtraction(5, 3);
        System.out.println("Subtraction Result: " + resultSubtraction);

        // Calling the division() method
        int resultDivision = cal.division(6, 2);
        System.out.println("Division Result: " + resultDivision);

        // Calling the multiplication() method
        int resultMultiplication = cal.multiplication(4, 3);
        System.out.println("Multiplication Result: " + resultMultiplication);
    }
  
}*/


public class Calculator {
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
         
            return num1 / num2;
         
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();

        double num1 = 24.0;
        double num2 = 6.0;

        System.out.println("Addition: " + c.addition(num1, num2));
        System.out.println("Subtraction: " + c.subtraction(num1, num2));
        System.out.println("Multiplication: " + c.multiplication(num1, num2));
        System.out.println("Division: " + c.division(num1, num2));
    }
}