package com.kunal;

public class Ceiling {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    // return the index of smallest no >= target
    static int ceiling(int[] arr, int target) {

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            
            if (target <= arr[mid]) {
                // ans found
                //but there might be same answer before it.
                //so instead of return mid
                //we will check the array again from start to mid (included)
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
}
