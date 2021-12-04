package com.mayank;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr={4,3,2,5,1};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void BubbleSort(int[] nums){
        boolean swapped;
        for(int i=0;i<nums.length;i++){
            swapped=false;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j-1] > nums[j]){
                    //swap
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
