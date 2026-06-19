package Sorting;
public class InsertionSort {
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 35, 48, 19, 256};
        insertionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}