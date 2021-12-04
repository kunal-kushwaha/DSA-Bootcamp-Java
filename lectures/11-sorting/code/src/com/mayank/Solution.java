package com.mayank;
import java.util.Arrays;
class Solution {
    public static void main(String[] args){
        int[] arr={1,2,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int check=arr[i]-1;
            if(arr[i] != arr[check]){
                swap(arr,i,check);
            }else{
                i++;
            }
        }
    }
    
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}