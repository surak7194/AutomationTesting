package Assignment;
public class MaxNumber {
	public static void main(String[] args) {
		int arr[] = {10, 67, 87, 23, 34};
		// Initialize maximum with the first element of the array
		int max = arr[0];
		// Loop through the array to find the maximum element
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		// Print the maximum number
		System.out.println("Maximum number in the array: " + max);
	}
}
