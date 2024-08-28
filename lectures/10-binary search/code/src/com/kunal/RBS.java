package com.kunal;
// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
public class RBS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6};
        System.out.println(findPivotWithDuplicates(arr));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
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

    // this will not work in duplicate values
    static int findPivot(int[] arr) {
        int start=0,end=arr.length-1;

        //case for unrotated
        if(arr[start]<arr[end]){
            return arr.length-1;
        }
        //binary to find pivot in rotated array
        while(start<=end){
            int mid=start+(end-start)/2;

            if (start==end){
                return mid;
            }
            else if(arr[start]>arr[mid]){
                end=mid-1;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }

     //function 1 works for either arrays having doplicates and non duplicates
    static int pivotInRotatedArray(int[] arr){
        int start=0,end=arr.length-1;

        //case for unrotated
        if(arr[start]<arr[end]){
            return arr.length-1;
        }
        //binary to find pivot in rotated array
        while(start<=end){
            int mid=start+(end-start)/2;

            if (start==end){
                return mid;
            }
            else if(arr[start]>arr[mid]){
                end=mid-1;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }

}
