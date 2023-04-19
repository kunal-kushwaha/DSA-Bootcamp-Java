package SolvedProblems.Recursion;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int m = start + (end - start) / 2;
        int pivot = arr[m];

        while(start <= end){

            while(arr[start] < pivot){
                start++;
            }
            
            while(arr[end] > pivot){
                end--;
            }

            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
    public static void main(String[] args) {
        int[] arr = {9,8,43,2,56,1};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
