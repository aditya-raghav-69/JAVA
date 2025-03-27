package searching_02.LinearSearch;

public class LinearSearch1 {

    int searchLinear(int arr[], int target) {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
                
            }
        }




        return -1;
    }


    public static void main(String[] args) {
    
        LinearSearch1 ls = new LinearSearch1();
    
  
        int index = ls.searchLinear(
                new int[] { 23, 33, 42, 43, 53, 53, 2, 344, 24, 995, 596868, 3353, 12, 321, 53153, 5345 }, 24);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array");
        }
} 
    
    
}
