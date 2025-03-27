package searching_02.LinearSearch;

public class MinInteger {
    
    public static void main(String[] args) {
        int arr[] = { 23, 33, 42, 43, 53, 53, 2, 344,-23,-22,-1, 24, 995, 596868,2, 3353, 12, 321, 53153, 5345 };

        System.out.println("The minimum integer in the array is: " + minInt(arr));

        System.out.println("The minimum integer in the array is: " + minInt(new int[] {}));
    }
    
    static int minInt(int arr[]) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            System.exit(0);
            
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }



        return min;
    }
}
