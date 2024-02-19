package Assignment;
public class MinNumber {
    public static void main(String[] args) {
        int arr[] = {50, 67, 87, 23, 34};
        // Initialize minimum with the first element of the array
        int min = arr[0];
        // Loop through the array to find the minimum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        // Print the minimum number
        System.out.println("Minimum number in the array: " + min);
    }
}
