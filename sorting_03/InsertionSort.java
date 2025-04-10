package sorting_03;


import java.util.Arrays;
// Insertion Sort in Java
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Stable: Yes
// In-place: Yes
// Best Case: O(n)
// Worst Case: O(n^2)




// Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time.
// It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
// However, it has the advantage of being simple to implement and is efficient for small data sets or lists that are already partially sorted.
// The algorithm works by dividing the array into a sorted and an unsorted part. It iterates through the unsorted part and inserts each element into its correct position in the sorted part.



public class InsertionSort {



    int[] inSort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j>0; j--) {
                if (arr[j] < arr[j - 1]) {
                    //swapping the elements

                    InsertionSort.swap(arr, j,j-1);
                } else {
                    break;
                }
            }
        }
        return arr;

    }


    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }




    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();

        System.out.println("Insertion Sort in Java");

        System.out.println(Arrays.toString(obj.inSort(new int[] { 5, 4, 3, 2, 1 })));
        System.out.println(Arrays.toString(obj.inSort(new int[] { 1, 2, 3, 4, 53,2,14,-11,-44,2,-44444,-1,0 })));
        System.out.println(Arrays.toString(obj.inSort(new int[] { 3, 2, 1, 5, 4 })));
        
    }
    
}
