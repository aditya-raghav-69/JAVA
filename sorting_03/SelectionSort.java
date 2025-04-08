package sorting_03;


import java.util.Arrays;

// Selection Sort in Java

// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Stable: No
// In-place: Yes
// Best Case: O(n^2)
// Worst Case: O(n^2)
// Average Case: O(n^2)
// Algorithm: Selection Sort



// Selection Sort is a simple sorting algorithm that divides the input array into two parts: sorted and unsorted.

public class SelectionSort {
    int[] SelectSort(int arr[]) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }
        return arr;
    }
    

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();


        System.out.println("Selection Sort in Java");

        System.out.println(Arrays.toString(obj.SelectSort(new int[] { 5, 4, 3, 2, 1 })));
        System.out.println(Arrays.toString(obj.SelectSort(new int[] { 1, 2, 3, 4, 5 })));
        System.out.println(Arrays.toString(obj.SelectSort(new int[] { 3, 2, 1, 5, 4 })));
        System.out.println(Arrays.toString(obj.SelectSort(new int[] { 1, 3, 2, 5, 4 })));
        System.out.println(Arrays.toString(obj.SelectSort(new int[] { 1, 2, 3, 5, 4,56,3,55,2,5555,312,635, })));

        
    }
    
}
