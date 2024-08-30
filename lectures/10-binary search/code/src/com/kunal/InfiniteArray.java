package com.kunal;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        try {
            while(target > arr[end]){ // finding the range where the element 
                //lies by reducing the array into chunks
                //(finding that chunk which has the answer)
                int newStart = end + 1;
                end = end + (end - start + 1)*2;
                start = newStart;
            }
        } catch (Exception e) {
            //exception may occour when value of end surpasses arr.length.
            //in that case we'll move the end index by 1.
            try {
                end = start + 1;
                while(target > arr[end]){
                    end++;
                } 
            } catch (Exception g) {
                return -1;// when the target element is larger than the largest element.
            }
        }
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
