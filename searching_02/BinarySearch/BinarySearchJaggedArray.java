package searching_02.BinarySearch;





public class BinarySearchJaggedArray {
    public static boolean binarySearchJagged(int[][] matrix, int target) {
        for (int[] row : matrix) {
            int left = 0, right = row.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (row[mid] == target) {
                    return true;
                } else if (row[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] jaggedArray = {
            {1, 3, 5, 7},
            {2, 4, 6},
            {8, 10, 12, 14, 16}
        };

        int target = 6;
        boolean result = binarySearchJagged(jaggedArray, target);
        System.out.println("Element " + target + (result ? " found." : " not found."));
    }
}
