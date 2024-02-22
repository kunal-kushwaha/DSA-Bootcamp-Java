package com.kunal;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    
    //Optimised cyclic sort
    //Author: Tausiq
    //This sorting method works for every consecutive array, i.e. for any unsorted ranges. 

    // static void sort(int[] arr) {
    //     int i = 0;
    //     while (i < arr.length) {
    //         int correct = Math.floorMod((arr[i] - 1), arr.length);
    //         if (arr[i] != arr[correct]) {
    //             swap(arr, i , correct);
    //         } else {
    //             i++;
    //         }
    //     }
    // }


}
