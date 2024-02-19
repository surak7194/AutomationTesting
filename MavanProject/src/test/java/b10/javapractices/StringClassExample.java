package b10.javapractices;
public class StringClassExample {
	public static void main(String[] args) {
		// string array using string litral
		String s= "Meera";
		String ss= "Meera";
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(ss.hashCode());
		
		// string array using new keyword
		String str= new String("Pallavi");
		System.out.println("String value : " + str);
		
       // String are imutable concept
		String AdharNumber = "9527918966";
		String Ad2= AdharNumber.concat("422");
		System.out.println(Ad2);
		System.out.println("--------------------------------");
		System.out.println(AdharNumber);
	}
}
