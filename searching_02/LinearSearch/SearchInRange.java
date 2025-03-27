package searching_02.LinearSearch;

public class SearchInRange {

    public static void main(String[] args) {

        SearchInRange sr = new SearchInRange();
        int arr[] = { 23, 33, 42, 43, 53, 53, 2, 344, 24, 995, 596868, 3353, 12, 321, 53153, 5345 };
        int target = 24;
        int start = 4;
        int end = arr.length - 5;
        sr.searchInt(arr, target, start, end);

    }
    

    void searchInt(int arr[], int target, int start, int end) {
        if (arr.length == 0) {
        System.out.println("Array is empty");
        return;
        }
        
        for (int i = start; i <= end; i++) {
            if(arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }



        System.out.println("Element not found in the array");
        return;
    }
    
}
