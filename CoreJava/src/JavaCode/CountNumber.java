package JavaCode;

public class CountNumber {

	public static void main(String[] args) {
	//String num= "";
		int num = 1436956;
		int count=0;
		while(num>0)
		{
		  num= num/10;
		  
		  count++;
		  
		}
		
		System.out.println("Count"+ count);
		
		

	}

}
