package searching_02.BinarySearch;

import java.util.Arrays;





// This approach is for the row and column wise sorted matrix not for the true sorted matrix


public class BinaryS2D {
    public static void main(String[] args) {
        // Your code here
        BinaryS2D bs = new BinaryS2D(); // Create an instance of the BinaryS2D class
        int arr[][]={
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int target = 29; // Target element to search for
        int result[] = bs.search(arr, target); // Call the search method to find the indices of the target element
        if(result[0]!=-1 && result[1]!=-1){
            System.out.println("Element found at index: " + Arrays.toString(result)); // Print the indices if found
        }else{
            System.out.println("Element not found in the array"); // Print if not found
        }


    }

    int[] search(int arr[][], int target) {
        // to understand this approach we need to understand the matrix first
        // the row=0 and col=arr[0].length-1 is the main point of this approach
        int row = 0;
        int col = arr[0].length - 1; // Start from the top-right corner of the matrix
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[] { row, col }; // Return the indices if the target is found

            }
            else if (arr[row][col] > target) {
                col--;// Move left if the current element is greater than the target
            }
            else if(arr[row][col]<target) {
                row++; // Move down if the current element is less than the target
            }
        }




        return new int[]{-1, -1}; // Return -1 if the target is not found in the array
    }
}