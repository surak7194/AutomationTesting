package b10.javapractices;
public class ArrayInJava 
{
	public static void main(String[] args) 
	{
		// Array Declaration
		String a[];
		String b[]= new String[5];
		
		//storing element in array
		b[0]="Lassi";
		b[1]="Coldcoffee";
		b[2]="Basundi";
		b[3]="Rabdi";	
		b[4]="Icegola";	
		
		//How to access element from array
		b[1]= "Apple Juice";	
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);	

		System.out.println("size if array= " + b.length);

		System.out.println("                   ");

		System.out.println("resuit using for loop");

		for(int i=0; i<b.length; i++) 
		{
			System.out.println(b[i]);	
		}
		System.out.println("                ");
		
		// Array Declaration + initialization
		String s[]={"suraj","avantika"};
		//  Result using for  each loop
		for(String c:s)
		{
			System.out.println(c);
		}
	}
}
