package Searching;
public class BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;
        int index = binarySearch(arr, target);
        System.out.println(index);
    }
}