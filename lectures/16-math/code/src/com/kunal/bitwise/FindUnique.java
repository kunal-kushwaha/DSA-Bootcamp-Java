package com.kunal.bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for (int n : arr)
        //for (int i = 0; i < arr.length; i++) {
            //    int n = arr[i];
            //    // Code block to be executed for each element in the array 'arr'
            {
            unique ^= n;
        }

        return unique;
    }
}
