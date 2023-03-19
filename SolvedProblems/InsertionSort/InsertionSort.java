package SolvedProblems.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 87, 3, 56, 12, 87, 34, 98, 55 };
        arr = insertionSort(arr);
        System.out.println("Sorted using insertion sort: " + Arrays.toString(arr));
    }
}
