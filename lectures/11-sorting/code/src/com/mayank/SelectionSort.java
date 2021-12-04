package com.mayank;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        //MAIN FUNCTION
        int[] arr={-1,-2,-45,20,47};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            //find the largest element and swap it with last element
            int lastIndex=arr.length-i-1;//index of last element
            int maxIndex=findMaxIndex(arr,0,lastIndex);//index of largest element
            swap(arr,maxIndex,lastIndex);
        }
    }

    static int findMaxIndex(int[] nums,int start,int end){
        //finding the index of the largest element
        int max=start;
        for (int i = start; i <= end; i++) {
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int first,int second){
        //swapping the largest number with last index number
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
