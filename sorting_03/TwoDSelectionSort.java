package sorting_03;


public class TwoDSelectionSort {
    public static void main(String[] args) {
        int[][] array = {{64, 25, 12, 22, 11}, {4, 0, 13, 9, 1}, {7, 23, 18, 33, 42}};
        System.out.println("Original array:");
        printArray(array);
        selectionSort(array);
        System.out.println("Sorted array:");
        printArray(array);
        int[][] arr = { { 64, 25, 12, 22, 11 }, { 4, 0, 13, 9, 1 }, { 7, 23, 18, 33, 42 }, { 4, 0, 13, 9, 1 },
                { 7, 23, 18, 33, 42 } };
        
        System.out.println("Original array:");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void selectionSort(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int[] minIndex = findMinIndex(array, i, j);
                swap(array, i, j, minIndex[0], minIndex[1]);
            }
        }
    }

    public static int[] findMinIndex(int[][] array, int row, int col) {
        int minIndex[] = {row, col};
        int min = array[row][col];
        for (int i = row; i < array.length; i++) {
            for (int j = (i == row) ? col + 1 : 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    minIndex[0] = i;
                    minIndex[1] = j;
                }
            }
        }
        return minIndex;
    }

    public static void swap(int[][] array, int row1, int col1, int row2, int col2) {
        int temp = array[row1][col1];
        array[row1][col1] = array[row2][col2];
        array[row2][col2] = temp;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}