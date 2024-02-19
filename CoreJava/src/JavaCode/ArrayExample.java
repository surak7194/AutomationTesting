package JavaCode;
public class ArrayExample {
	public static void main(String[] args) {
		int arr []= {10, 20, 30, 40, 50};
		
		/*
		 //  print array using array index
		System.out.println("1st element of array:  " +  arr[0]);
		System.out.println("2nd element of array:  " +  arr[1]);
		System.out.println("3rd element of array:  " +  arr[2]);
		System.out.println("4th element of array:  " +  arr[3]);
		System.out.println("5th element of array:  " +  arr[4]);

		// print the array using loop
		for (int i=0; i<arr.length; i++) {
			System.out.println("Element at index " +  i +   ": " +  arr[i] );
		}*/
		/*
		// print the array by using for each
		for (int a : arr) {
			System.out.println("Element of array:  " +  a);
		}
		 */
		// Occurance of given element in array
	/*	int arr []= {10, 20, 10, 40, 10};
		int counter = 0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] == 10)
			{
				counter++;
			}
		}
		System.out.println("Element 10 is occured : " + counter + "  Times");
		*/
		// Array Reverse
		for (int i=arr.length-1; i>=0;  i--) {
			System.out.println("Element at index " +  i +   ": " +  arr[i] );
		}	
	}
}
