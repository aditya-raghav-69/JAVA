
 package ArraysAndArrayList_01;


 

 public class matrixMulti {


    int[][] multi(int[][] mat1,int[][] mat2){
        int row1= mat1.length;
        int col1 = mat1[0].length;
        int row2 = mat2.length;
        int col2 = mat2[0].length;
        int[][] result = new int[row1][col1];

        System.out.println("Please! follow the passing rules  of matrix multiplication");
        if (col1 != row2) {
            System.out.println("invalid input");
            System.exit(1);
            
        }

       for(int i=0;i<row1;i++){
        for(int j=0;j<col2;j++){
            for(int k=0;k<col1;k++){
                result[i][j] += mat1[i][k]*mat2[k][j];
            }
          }
       }





        return result;
    }
    public static void main(String[] args) {
        matrixMulti m1 = new matrixMulti();
        int[][] matrix = m1.multi(new int[][]{{2,2,2},{3,3,3},{4,4,4}}, new int[][]{{2,2,2},{3,3,3},{4,4,4}});

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
}