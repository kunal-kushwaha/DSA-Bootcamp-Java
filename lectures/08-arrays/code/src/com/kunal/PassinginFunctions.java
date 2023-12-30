package com.kunal;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        // Integer object nums is Initialized with Values
        int[] nums = {3, 4, 5, 12};
        // We are printing the values using that nums object
        System.out.println(Arrays.toString(nums));    
        // We are passing the same nums array object in the change function
        change(nums);// It will Changes in the Original nums array object 
        //After Changing in the original nums array object
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr) {
        //Here we are changing the values
        arr[0] = 99;
        arr[2] = 10;
        // It will make changes in the original nums array object
    }

    //Output :
    // [3,4,5,12]
    // [99,4, 10, 12]
}
