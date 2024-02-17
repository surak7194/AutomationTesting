package JavaCode;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) 
	{
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
           String str = sc.next().toLowerCase();
          // String nstr= str.toLowerCase();
           String rstr = "";
           for (int i= str.length()-1; i>=0; i--)
           {
        	   rstr= rstr+str.charAt(i);
        	   
           }
           if(str.equals(rstr))
           {
        	  System.out.println("String is pallendrom");
           }
           else
        	   System.out.println("not pallindrom");
        	   
           
       
        sc.close();

	}

}
