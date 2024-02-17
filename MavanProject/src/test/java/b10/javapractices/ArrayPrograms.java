package b10.javapractices;
public class ArrayPrograms{
	public static void main(String[] args){
		//ascending order
		int rank[]= {22,88,54,87,100,12,11,56,69,21};
		System.out.println("\n numbers in ascending order");
		for(int s=0;  s<rank.length; s++)		{
			for(int p=s+1; p<rank.length; p++)	{
				if (rank[s] > rank[p])
				{
					int  temp= rank[s];
					rank[s]=rank[p];
					rank[p]=temp;
				}
			}
		}
		for (int a: rank)
		{
			System.out.println(  a);
		}	
//Descending order
		System.out.println("\n numbers in descending order");
		for(int s=0;  s<rank.length; s++)
		{
			for(int p=s+1; p<rank.length; p++)
			{
				if (rank[s] < rank[p])
				{
					int  temp= rank[s];
					rank[s]=rank[p];
					rank[p]=temp;
				}
			}
		}
		for (int a: rank)
		{
			System.out.println(  a);
		}
		
	}

}
