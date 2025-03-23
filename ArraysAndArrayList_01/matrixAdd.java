package ArraysAndArrayList_01;

public class matrixAdd {


    static int[][] matrixAdd(int[][] matrix1, int[][] matrix2) {

        int arr[][] = new int[matrix1.length][matrix1[0].length];






        return arr;
    }
    public static void main(String[] args) {


        int arr[][] = matrixAdd(new int[][] { { 2, 4, 5 }, { 1, 2, 3 } }, new int[][] { { 6, 7, 8 }, { 2, 3, 4 } });
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
