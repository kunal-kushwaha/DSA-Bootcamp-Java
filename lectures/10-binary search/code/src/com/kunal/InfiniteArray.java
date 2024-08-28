package com.kunal;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 8, 9, 9, 32, 34, 54, 54, 654};
        int target = 8;
        int ans = Search(arr, target);
        System.out.println(ans);  // Expected output: 14
    }

    static int Search(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Exponential search to find the range where the target might exist
        while (true) {
            try {
                if (arr[end] >= target) {
                    break;
                }
                int newStart = end + 1;
                end = end + (end - start + 1) * 2;
                start = newStart;
            } catch (ArrayIndexOutOfBoundsException e) {
                // If out-of-bounds, set end to a reasonable upper bound and break
                end = findUpperBound(arr, start);
                break;
            }
        }

        // Perform binary search within the identified range
        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            try {
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // If out-of-bounds, adjust the end
                end = mid - 1;
            }
        }
        return -1;
    }

    // Helper method to find a reasonable upper bound when the array is out-of-bounds
    static int findUpperBound(int[] arr, int start) {
        int end = start;
        while (true) {
            try {
                int val = arr[end];  // This will throw an exception if out of bounds
                end = end * 2;  // Exponentially increase end to quickly find the upper bound
            } catch (ArrayIndexOutOfBoundsException e) {
                break;  // When out-of-bounds, return the last valid index
            }
        }
        return end - 1;
    }
}
