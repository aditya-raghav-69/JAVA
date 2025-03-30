package searching_02.BinarySearch;

import java.util.Scanner;
import java.util.Arrays;

public class RecursiveBS {
    // Binary Search Algorithm (Recursive)
    // This method returns the index of the target element in the array if found, otherwise -1
    // This could be more optimized if consider the array's low and high values in the if statement 
// instead of using the mid value in the if statement.
    // This method is a recursive implementation of binary search.

    int recurSearch(int[] arr, int low, int high, int target) {
        if (low <= high) {
            int mid = (low + high) / 2; // Calculate the middle index
            

            if (arr[mid] == target) {
                return mid; // Target found, return the index
            }
            if (target < arr[mid]) {
                return recurSearch(arr, low, mid - 1, target); // Target is in the left half, search in the left half
            } else {
                return recurSearch(arr, mid + 1, high, target); // Target is in the right half, search in the right half
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RecursiveBS bs = new RecursiveBS();

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt(); // Read the number of elements
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n]; // Create an array of size n

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element into the array
        }
        
        Arrays.sort(arr); // Sort the array before performing binary search
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Enter the target element to search: ");
        int target = sc.nextInt(); // Read the target element

        int result = bs.recurSearch(arr, 0, n - 1, target); // Call the binary search method
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result); // Print the index if found
            
        }








        sc.close();
    }
    
}
