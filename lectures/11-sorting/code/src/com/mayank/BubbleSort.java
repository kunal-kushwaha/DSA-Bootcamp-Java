package com.mayank;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        //main method
        int[] arr={4,2,5,3,1};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr){
        //Sorting using Bubble Sort method
        boolean swapped=false;
        for (int i = 0; i < arr.length; i++) {
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swappng the elements
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

}
