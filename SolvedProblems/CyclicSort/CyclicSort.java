package SolvedProblems.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static int[] cyclicSort(int[] arr) {
        for (int i = 0; i < arr.length;) {
            int checkIndex = arr[i] - 1;
            if (arr[checkIndex] == arr[i]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[checkIndex];
                arr[checkIndex] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 6, 2, 5, 7, 4, 9, 3, 1 };
        arr = cyclicSort(arr);
        System.out.println("Sorted using cyclic sort: " + Arrays.toString(arr));
    }
}
