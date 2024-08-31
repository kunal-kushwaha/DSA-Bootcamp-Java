package com.kunal.arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 16, 8};
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] arr, int index) {
        // base condition
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
