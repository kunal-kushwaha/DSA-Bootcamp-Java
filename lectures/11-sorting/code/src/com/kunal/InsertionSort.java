package com.kunal;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };

        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
