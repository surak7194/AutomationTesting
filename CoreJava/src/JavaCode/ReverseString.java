package JavaCode;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
           String str = sc.nextLine();
           String rstr = "";
           for (int i= str.length()-1; i>=0; i--)
           {
        	   rstr= rstr+str.charAt(i);
        	   
           }
        System.out.println("reverse string is:");   
        System.out.println(rstr);
        sc.close();
	}

}
