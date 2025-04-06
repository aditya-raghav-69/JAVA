package searching_02.BinarySearch;

public class StrictlyBinarySearch {

    // This method performs a binary search on a specific row of the matrix.
    // It takes the row index, column start and end indices, and the target value as parameters.
    // it this I reduced the search space to a single row and then performed a binary search on that row.
    // the search space can be reduced to two rows, and then a binary search can be performed on those two rows.
    // The time complexity of this approach is O(log n) for the binary search on the row, and O(log m) for the binary search on the rows.

    int[] binarySearch(int[][] mat, int row, int cStart, int cEnd, int target) {
        int mid = cStart + (cEnd - cStart) / 2;

        if (mat[row][mid] == target) {
            return new int[]{row, mid};
        } else if (mat[row][mid] < target) {
            if (mid + 1 <= cEnd) {
                return binarySearch(mat, row, mid + 1, cEnd, target);
            } else {
                return new int[]{-1, -1};
            }
        } else {
            if (mid - 1 >= cStart) {
                return binarySearch(mat, row, cStart, mid - 1, target);
            } else {
                return new int[]{-1, -1};
            }
        }
    }

    int[] binaryMain(int[][] mat, int target) {
        int rows = mat.length;
        int cols = mat[0].length;

        int cStart = 0, cEnd = cols - 1;
        if (rows == 1) {
            return binarySearch(mat, 0, cStart, cEnd, target);
        }

        // Reduce the search space to a single row
        while (cStart < cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (mat[mid][0] <= target && mat[mid][cols - 1] >= target) {
                return binarySearch(mat, mid, 0, cols - 1, target);
            } else if (mat[mid][0] > target) {
                cEnd = mid - 1;
            } else {
                cStart = mid + 1;
            }
        }

        // Check the last row
        if (cStart == cEnd && mat[cStart][0] <= target && mat[cStart][cols - 1] >= target) {
            return binarySearch(mat, cStart, 0, cols - 1, target);
        }

        // If not found in any row, return -1, -1
        return new int[]{-1, -1}; // Not found
    }

    static void printResult(int[][] mat, int target) {
        StrictlyBinarySearch obj = new StrictlyBinarySearch();
        int[] result = obj.binaryMain(mat, target);

        if (result[0] == -1 && result[1] == -1) {
            System.out.println("Element not found in the matrix.\n\n");
        } else {
            System.out.println("Element " + target + " found at row " + result[0] + ", column " + result[1] + ".\n\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("Strictly Binary Search in a 2D Matrix\n\n");
        System.out.println("The matrix is sorted in a strictly increasing order.\n\n");

        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int target = 7;
        printResult(mat, target); // Element found at row 1, column 2

        target = 17;
        printResult(mat, target); // Element not found in the matrix.

        target = 1;
        printResult(mat, target); // Element found at row 0, column 0

        target = 16;
        printResult(mat, target); // Element found at row 3, column 3

        target = 5;
        printResult(mat, target); // Element found at row 1, column 0

        target = 10;
        printResult(mat, target); // Element found at row 2, column 1
    }
}
