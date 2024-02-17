package JavaCode;

import java.util.Scanner;

public class ReverseLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
           String str = sc.nextLine();
           
           String[] astr= str.split(" ");
           
           //System.out.println(astr[0]);
           String rstr = "";
           for (int i= astr.length-1; i>=0; i--)
           {
        	
        	   rstr= rstr+astr[i]+" ";
        	   
           }
        System.out.println("reverse string is:");   
        System.out.println(rstr);
        sc.close();
        
	}

}
