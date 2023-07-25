package com.kunal;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 100;
        System.out.println(infiniteArray(arr, target, 0,1));
    }

    static int infiniteArray(int[] arr, int target,int start, int end ){
        // condition for the target to lie in the range
        if(end - start < 0) {
            return -1;
        }
        try {
            while(target > arr[end]) {
                int oldS = start;
                start = end+1;
                end += (end+1-oldS)*2;
            }
        }catch(ArrayIndexOutOfBoundsException e) {
            end = end - (end-start)/2 - 1;
            return infiniteArray(arr, target , start, end);
        }
        System.out.println("s :"+start +" end: "+end);
        return binarySearch(arr, target, start, end);

    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
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
