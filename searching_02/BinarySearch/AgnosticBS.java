package searching_02.BinarySearch;
// in this we are gonna implement the agnostic binary search algorithm

// This algorithm is used to search for a target element in a sorted array, regardless of whether the array is sorted in ascending or descending order.

// The algorithm works by first checking the order of the array (ascending or descending) and then performing a binary search accordingly.
import java.util.Arrays;
// import java.util.Collection;
import java.util.Collections;

public class AgnosticBS {
    public static void main(String[] args) {

        AgnosticBS bs = new AgnosticBS(); // Create an instance of the AgnosticBS class

        Integer arr[] = { 23, 33, 42, 43, 53, 53, 2, 344,-23,-22,-1, 24, 995, 596868,2, 3353, 12, 321, 53153, 5345 }; // Sample array
        Arrays.sort(arr); // Sort the array before performing binary search

        System.out.println("The size of the array is: " + arr.length); // Print the size of the array
        System.out.println("The sorted array is: " + Arrays.toString(arr)); // Print the sorted array

        int target = -1; // Target element to search for
        int result = bs.searchAgno(arr, target); // Call the searchAgno method to find the index of the target element

        if (result != -1) {
            System.out.println("Element found at index: " + result); // Print the index if found
        } else {
            System.out.println("Element not found in the array"); // Print if not found

        }
        

        // Test with the descending order array
        // The array is sorted in descending order
        Integer arr2[] = { 23, 33, 42, 43, 53, 53, 2, 344,-23,-22,-1, 24, 995, 596868,2, 3353, 12, 321, 53153, 5345 }; // Sample array
        Arrays.sort(arr2,Collections.reverseOrder()); // Sort the array before performing binary search
        System.out.println("The sorted array is: " + Arrays.toString(arr2)); // Print the sorted array

        int target2 = -1; // Target element to search for
        int result2 = bs.searchAgno(arr2, target2); // Call the searchAgno method to find the index of the target element

        if (result != -1) {
            System.out.println("Element found at index: " + result2); // Print the index if found
        } else {
            System.out.println("Element not found in the array"); // Print if not found
            
        }



    }
    
    // Binary Search Algorithm (Agnostic)
    // This method returns the index of the target element in the array if found, otherwise -1
    int searchAgno(Integer arr[], int target) {

        int low = 0;
        int high = arr.length - 1;

        boolean isAsc = arr[low] < arr[high]; // Check if the array is sorted in ascending order

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate the middle index
            
            if (arr[mid] == target) {
                return mid; // Target found, return the index
            }
            if (isAsc) {// If the array is sorted in ascending order
                // Check if the target is greater than the middle element
                if (target > arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }  // If the array is sorted in descending order
            else {
                if (target>arr[mid]) {
                    high = mid - 1;
                    
                } else {
                    low = mid + 1;
                }
            }
            
        }
        



        return -1; // Element not found
    }
}
