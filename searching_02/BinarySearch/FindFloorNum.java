package searching_02.BinarySearch;

public class FindFloorNum {
    public int findFloor(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int floor = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }

            if (arr[mid] < target) {
                floor = arr[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return floor;
    }
    
    public static void main(String[] args) {
        FindFloorNum finder = new FindFloorNum();
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;
        int floor = finder.findFloor(arr, target);
        System.out.println("The floor number of " + target + " is: " + floor);
    }
}
