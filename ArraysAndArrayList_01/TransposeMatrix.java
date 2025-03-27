package ArraysAndArrayList_01;



public class TransposeMatrix {



    static void transpose(int[][] matrix) {

        // printing the matrix
        System.out.println("The matrix before transposing is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // transposing the matrix
        int[][] arr = new int[matrix[0].length][matrix.length];
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[j][i] = matrix[i][j];
            }
        }


        // printing the transposed matrix
        System.out.println("The matrix after transposing is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        
        }









        
    }
    public static void main(String[] args) {
        // matrix defined for passing to the function
        int[][] matrix = { { 2, 4, 5 }, { 1, 2, 3 }, { -22, 34, 32 } };
        
        transpose(matrix);
        }
    
}