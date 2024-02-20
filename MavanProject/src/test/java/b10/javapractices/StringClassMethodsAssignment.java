package b10.javapractices;

public class StringClassMethodsAssignment {

	public static void main(String[] args) {
		String s = "Suvantika Weds Ajitkumar";
		String s2 = "SuvantikA Weds Ajitkumar";

		/*
		  Returns the char value at thespecified index. An index ranges from 0 to
		 length() - 1. The first char value of the sequenceis at index 0, the next at
		 index 1,and so on, as for array indexing.
		 */
		char c = s.charAt(5);
		System.out.println(c);
		
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareToIgnoreCase(s2));
		System.out.println(s.concat(" in pune"));
        System.out.println(s);
        System.out.println(s.contains("pune"));
        System.out.println(s.contains("  Weds"));
        System.out.println(s.endsWith("Ajitkumar"));
        System.out.println(s.equals(s2));
        System.out.println("----------------");
        System.out.println(s.equalsIgnoreCase("suvantika weds ajitkumar"));
        System.out.println(s.indexOf("Weds"));
        System.out.println(s.indexOf('m'));
        System.out.println(s.indexOf('W', 5));
        System.out.println(s2.length());
        System.out.println(s.isEmpty());
        String p1= "";
        System.out.println(p1.isEmpty());
        //space removed
        System.out.println("      my name    is    white wolf      ".trim());
        System.out.println(s.toUpperCase());
        System.out.println(s2.toLowerCase());
        // convert string into char array
       char [] array = s.toCharArray(); 
       for (char j : array)
       {
    	   System.out.println(j);
       }
       System.out.println(s.substring(9));
       System.out.println(s.substring(0, 15));

	}

}
