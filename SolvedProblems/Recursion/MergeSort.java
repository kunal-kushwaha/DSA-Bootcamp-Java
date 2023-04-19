package SolvedProblems.Recursion;

import java.util.Arrays;

public class MergeSort {
    static void merge(int[] arr, int start, int mid, int end){
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int z = 0; z < mix.length; z++){
            arr[start + z] = mix[z];
        }
    }

    static void inPlaceMergeSort(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }

        int mid = start + (end - start) / 2;
        inPlaceMergeSort(arr, start, mid);
        inPlaceMergeSort(arr, mid, arr.length);

        merge(arr, start, mid, end);
    }

    // This is merge sort with extra space
    static int[] merge(int[] first, int[] second){
        int[] arr = new int[first.length +  second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] > second[j]){
                arr[k] = second[j];
                j++;
            }
            else{
                arr[k] = first[i];
                i++;
            }
            k++;
        }

        while(i < first.length){
            arr[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            arr[k] = second[j];
            j++;
            k++;
        }

        return arr;
    }

    static int[] mergeSortWithExtraSpace(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSortWithExtraSpace(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSortWithExtraSpace(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);   
    }

    public static void main(String[] args) {
        int[] arr = {9,8,27,65,15,44,32,12,1};

        // arr = mergeSortWithExtraSpace(arr);
        inPlaceMergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
