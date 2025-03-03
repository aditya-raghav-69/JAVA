package arrays;


import java.util.Scanner;


public class TwoDArray {
    

public static void main(String[] args) {
    int[][] arr = new int[3][3];

    Scanner s1 = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {

            System.out.println("Enter the element at position " + arr[i][j]);
            arr[i][j] = s1.nextInt();
        }
        System.out.println("\n");
    }


    for (int i = 0; i < (arr.length); i++) {
        for (int j = 0; j < (arr[i].length); j++) {
            System.out.print(arr[i][j] + "     ");
        }
        System.out.println("\n");
    }
    s1.close();


}

    
}