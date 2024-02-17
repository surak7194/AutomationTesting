package b10.javapractices;
public class MultiDimentionalArray 
{
	public static void main(String[] args)
	{
		/*
		int multi[][] = new int[3][3];
		multi[0][0] = 01;
		multi[0][1] = 22;
		multi[0][2] = 34;

		multi[1][0] = 40;
		multi[1][1] =50;
		multi[1][2] = 80;

		multi[2][0] = 85;
		multi[2][1] = 87;
		multi[2][2] = 88;
		 */
		int a[][]= {{10,  20,  40, 12, 22}, {45,  46,  48,  96, 55}, {42,  26,  88,  99, 52}};

		//print length of row
		System.out.println("row length: " + a.length );

		//print length of column
		System.out.println("column length: " + a[0].length);

		// accessing value by using index
		System.out.println(a[0][2]);

		//changing value of index
		a[1][2]=500;

		// printing by using for loop
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] +  "\t");
			}
			System.out.println("  ");
		}
	}
}
