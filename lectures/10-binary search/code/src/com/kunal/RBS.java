package com.kunal;
// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0 ; 
        System.out.println(search(arr, target);
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            // now we have two parts of the arr so we check where value lies??
            // let's check first which part is sorted? left half or right half??
            // if first if condition is true then left half is sorted otherise right half is.

            if (arr[start] <= arr[mid]) {
                // checking is the target lies in the sorted part or not??
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                }
                 else {
                    start = mid + 1;
                }
            } else {
                // this will only execute if the left half is not sorted that means this one is.
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } 
                else {
                    end = mid - 1;
                }
            }
        }
       return -1; 
    }

   // And for the Array that consist duplicates we can add this edge case : 
  if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start = start + 1;
                end = end - 1;
                continue;
            } 

}
