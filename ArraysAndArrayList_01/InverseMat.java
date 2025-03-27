package ArraysAndArrayList_01;

public class InverseMat {

    // Method to calculate the inverse of a matrix
    public static void calculateInverse(double[][] matrix) {
        int n = matrix.length;

        // Check if the matrix is square
        if (n != matrix[0].length) {
            System.out.println("Inverse is not possible. The matrix is not square.");
            return;
        }

        if (n == 2) {
            calculateInverse2x2(matrix);
        } else if (n == 3) {
            calculateInverse3x3(matrix);
        } else {
            System.out.println("Inverse calculation is only implemented for 2x2 and 3x3 matrices.");
        }
    }

    // Method to calculate the inverse of a 2x2 matrix
    private static void calculateInverse2x2(double[][] matrix) {
        double determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        if (determinant == 0) {
            System.out.println("Inverse is not possible. The determinant is zero.");
            return;
        }

        // Compute the inverse for a 2x2 matrix
        double[][] inverseMatrix = new double[2][2];
        inverseMatrix[0][0] = matrix[1][1] / determinant;
        inverseMatrix[0][1] = -matrix[0][1] / determinant;
        inverseMatrix[1][0] = -matrix[1][0] / determinant;
        inverseMatrix[1][1] = matrix[0][0] / determinant;

        // Print the inverse matrix
        System.out.println("The inverse matrix is: ");
        printMatrix(inverseMatrix);
    }

    // Method to calculate the inverse of a 3x3 matrix
    private static void calculateInverse3x3(double[][] matrix) {
        double determinant = calculateDeterminant3x3(matrix);
        if (determinant == 0) {
            System.out.println("Inverse is not possible. The determinant is zero.");
            return;
        }

        // Compute the adjoint matrix
        double[][] adjoint = calculateAdjoint3x3(matrix);

        // Compute the inverse by dividing the adjoint by the determinant
        double[][] inverseMatrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverseMatrix[i][j] = adjoint[i][j] / determinant;
            }
        }

        // Print the inverse matrix
        System.out.println("The inverse matrix is: ");
        printMatrix(inverseMatrix);
    }

    // Method to calculate the determinant of a 3x3 matrix
    private static double calculateDeterminant3x3(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to calculate the adjoint of a 3x3 matrix
    private static double[][] calculateAdjoint3x3(double[][] matrix) {
        double[][] adjoint = new double[3][3];

        adjoint[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        adjoint[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        adjoint[0][2] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];

        adjoint[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        adjoint[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        adjoint[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);

        adjoint[2][0] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        adjoint[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        adjoint[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        return adjoint;
    }

    // Utility method to print a matrix
    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example 2x2 matrix
        double[][] matrix2x2 = {
            {4, 7},
            {2, 6}
        };

        // Example 3x3 matrix
        double[][] matrix3x3 = {
            {6, 1, 1},
            {4, -2, 5},
            {2, 8, 7}
        };

        System.out.println("For 2x2 matrix:");
        calculateInverse(matrix2x2);

        System.out.println("\nFor 3x3 matrix:");
        calculateInverse(matrix3x3);
    }
}