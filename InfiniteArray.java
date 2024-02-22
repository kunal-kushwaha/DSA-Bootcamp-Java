package com.kunal;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170 };
        int target = 170;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;
        // Here we use try-catch block to handle case where the calculated 'end' exceeds
        // arr.length - 1
        try {
            while (arr[end] < target) {
                int tempStart = end + 1;
                end = end + (end - start + 1);
                start = tempStart;
            }
        } catch (Exception e) {
            // Block of code to handle errors
            end = end - 1;
        }

        return binarySearch(arr, target, start, end);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds
            // the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
