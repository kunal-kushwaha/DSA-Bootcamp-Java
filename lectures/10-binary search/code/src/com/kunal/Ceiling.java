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
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;


            if (target < arr[mid]) {
                end = mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            } else{
                // ans found
                // but there might be same answer before it.
                // Suppose we have an array :
                //    -> index : 0 1 2 3 4 5 6 7
                // int[] nums = {3,3,6,6,7,8,8,9};
                // ---------------s----m------e
                // According to previous code, it will return index 3, but it is wrong in this case.
                // ans should be index 2 as this is first smallest element greator than or equal to target.
                // so instead of return mid
                // we will check the array again from start to mid (included)
                end=mid;
                // condition for infinite loop -> end will be equal to mid
                // but it will be possible only when start will be equal to end
                // that will be our while loop condition
            }
        }
        return start;
    }
}
