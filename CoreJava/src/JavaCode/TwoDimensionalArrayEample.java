package JavaCode;
public class TwoDimensionalArrayEample 
{
	public static void main(String[] args) 
	{
		int arr [][]= {{10, 22, 33}, {44, 54, 66}, {21, 24, 26}};
		/*
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[2][2]);
		 */
		/*	// Print of array using loop
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++) 
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		} */
		int sum= 0;
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++) 
			{
				if (i==j)
				{
					 System.out.println("Diagonal Element : " + arr[i][j]);
					  sum= sum + arr[i][j];
				}	
			}
		} 
		System.out.println("Sum of diagonal : " + sum);
	}

}
