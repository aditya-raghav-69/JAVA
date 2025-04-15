// package sorting_03.CycleSort;

// It is the second approach to Cycle Sort in which we sort the array in place and only use O(1) space complexity
// It is a non-comparison based sorting algorithm that is used to sort the array in place and is not stable
// in this approach only 1 to N or 0 to N-1 elements are used in the array and the rest of the elements are not used in the array
// Non continuos array, mixed elements and duplicates are not allowed in this approach

import java.util.Arrays;

public class CycleSort2 {
    public static void main(String[] args) {


        
        CycleSort2 obj = new CycleSort2();
        int arr[] = { 3, 1, 5, 4, 2 ,7,6,10,9,8};


        System.out.println("Original array is: ");
        System.out.println("---------------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------");

        obj.cycleSort(arr);

        System.out.println("Sorted array is: ");

        System.out.println("---------------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------");

    }
    
    void cycleSort(int arr[]) {
        int n = arr.length;


        int i = 0;

        while(i<n){

            int correctPostion = arr[i] - 1; // as the elements are from 1 to N, so the correct position of the element is arr[i]-1
        if(i<n && arr[i]!= arr[correctPostion] ){
            int temp = arr[i];
            arr[i] = arr[correctPostion];
            arr[correctPostion] = temp;
            // as the element is not in its correct position, so we need to check the element again
            // so we are not incrementing the value of i
        }else{
            i++;
        }
        
        }

    
        
    }
}
