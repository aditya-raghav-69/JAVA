package ArraysAndArrayList_01;



public class TransposeMatrix {



    static void transpose(int[][] matrix) {
        
    }
    public static void main(String[] args) {
        // matrix defined for passing to the function
        int[][] matrix = { { 2, 4, 5 }, { 1, 2, 3 }, { -22, 34, 32 } };
        
        // printing the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}