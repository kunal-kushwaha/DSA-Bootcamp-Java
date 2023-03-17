package SolvedProblems.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void swap(int[] arr, int maxIndex, int last){
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    public static int getMaxValueInTheRange(int[] arr, int first, int last) {
        int maxIndex = first;
        for (int i = first; i <= last; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxValueInTheRange(arr, 0, last);
            swap(arr,maxIndex,last);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 78, 4, 8, 65};
        arr = selectionSort(arr);
        System.out.println("Array sorted using selection sort: " + Arrays.toString(arr));
    }
}
