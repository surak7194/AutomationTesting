package b10.javapractices;
public class CharAsending{
	public static void main(String[] args){
		//ascending order
		char c[]= {'b',  'z',  'q',  'd',  'c',  'D'};
		for(int s=0;  s<c.length; s++)	{
			for(int p=s+1; p<c.length; p++)		{
				if (c[s] > c[p])			{
					char  temp= c[s];
					c[s]=c[p];
					c[p]=temp;
				}
			}
		}
		for (char a: c)
		{
			System.out.println(  a);
		}
	}
}
