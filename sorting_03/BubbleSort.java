package sorting_03;
import java.util.Arrays;

public class BubbleSort {

    // This method sorts the given array using the bubble sort algorithm.

    // It takes an array of integers as input and sorts it in ascending order.
    // The time complexity of this algorithm is O(n^2) in the worst case, where n is the number of elements in the array.
    // The space complexity is O(1) since it sorts the array in place.

    void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    //swapping the elements
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        

        System.out.println("Bubble Sort Algorithm \n");
        int arr[] = {4, 34, 275, -12,64, 22, 131, 90};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        ob.bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Time Complexity: O(n^2)");
        System.out.println("Space Complexity: O(1)");
        System.out.println("Best Case: O(n)");
        System.out.println("Worst Case: O(n^2)");
        System.out.println("Average Case: O(n^2)");
        System.out.println("Stability: Stable");
        System.out.println("In-place: Yes");
    }
    
}
