package searching_02.LinearSearch;



public class SearchInString {


    public static void main(String[] args) {
        

        String str = " I am maximus decimus meredius";

        int n = str.length();
        
        char target = 'm';
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == target) {
                index = i;
                break;
            }
        }
        if (target != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array");
            
        }

        
    }
    
}
