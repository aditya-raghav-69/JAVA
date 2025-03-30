package searching_02.BinarySearch;


import java.util.Scanner;
import java.util.Arrays;

public class IterativeBS {
    // Binary Search Algorithm (Iterative)


    // This method returns the index of the target element in the array if found, otherwise -1

    int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        // Loop until the low index is less than or equal to the high index
        while (low <= high) {
            int mid = (low + high) / 2; // Calculate the middle index
            // Check if the target element is present at mid index

            if (target == arr[mid]) {
                return mid; // Target found, return the index

            }
            if (target < arr[mid]) {
                high = mid - 1; // Target is in the left half, update high index
            }
            else {
                low = mid + 1; // Target is in the right half, update low index
            }
        }



        return -1; // Element not found
    }

    public static void main(String[] args) {
        IterativeBS bs = new IterativeBS();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt(); // Read the number of elements

        int[] arr = new int[n]; // Create an array of size n
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element into the array
        }
        System.out.println("Enter the target element to search: ");
        int target = sc.nextInt(); // Read the target element
        Arrays.sort(arr); // Sort the array before performing binary search
        System.out.println("Sorted array: " + Arrays.toString(arr)); // Print the sorted array

        int result = bs.binarySearch(arr, target); // Call the binary search method
        if (result != -1) {
            System.out.println("Element found at index: " + result); // Print the index if found
        } else {
            System.out.println("Element not found in the array."); // Print if not found
        }

        sc.close(); // Close the scanner to avoid resource leaks
        
    }
    
}
