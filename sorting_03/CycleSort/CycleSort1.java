import java.util.Arrays;

// This implementation assumes the input array contains unique values from 0 to n with no duplicates or missing numbers.

public class CycleSort1 {

    void cycleSort(int[] arr) {
        int len = arr.length;

        if (len == 0) return;

        int j = 0;
        while (j < len) {
            if ( arr[j] != arr[arr[j]]) {
                int correctIndex = arr[j];
                int temp = arr[j];
                arr[j] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        CycleSort1 obj = new CycleSort1();

        int arr[] = { 3, 1, 5, 4, 2, 0, 7, 6, 10, 9, 8 };

        System.out.println("Original array is:");
        System.out.println("---------------------");
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------");
        obj.cycleSort(arr);

        System.out.println("Sorted array is:");
        System.out.println("---------------------");
        System.out.println(Arrays.toString(arr));
    }
}
