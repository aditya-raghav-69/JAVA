package ArraysAndArrayList_01;



public class matrixSub {
    static void matSub(int[][] matrix1, int[][] matrix2) {

        int arr[][] = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++) {
                arr[i][j]=matrix1[i][j]-matrix2[i][j];
            }
        }
        // printing the matrices
        // matrix1

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        // matrix2
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        
        System.out.println("\n");
        // matrix after addition
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        


        
    }
    public static void main(String[] args) {
        // two matrices defined for passing to the function
        int[][] matrix1 = { { 2, 4, 5 }, { 1, 2, 3 } };

        int[][] matrix2 = { { 6, 7, 8 }, { 2, 3, 4 } };

        matSub(matrix1, matrix2);
         

        System.out.println();

        matSub(new int[][]{{21,33,44},{20,22,33}}, new int[][]{{10,20,30},{40,50,60}});
        
            }
    
}
