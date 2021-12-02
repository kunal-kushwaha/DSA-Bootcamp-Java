package com.kunal;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));
    }


    static int[] search(int[][] matrix, int target) {
       int start = 0;

        // we are going to treat the matrix like a regular array
        // {
        //   {1,2,3,4},
        //   {5,6,7,8},
        //   {9,10,11,12}
        //  }
        // end should point at 12
        // and count starting from 1, 12 is at the 11th index
        // therefore end = 11
        // end = (3 - 1) * 4  + 3 = 8 + 3 = 11
        int end  = (matrix.length - 1) * (matrix[0].length ) + (matrix[0].length - 1);

        while(start <= end){
            // 1st loop
            // start = 0, end = 11, m = 5
            int m = start + (end - start) / 2;

            // convert back length to [i,j] to access the value
            // e.g 5 => [5/3, 5%3] = [1, 2]
            int i = m/matrix[0].length;
            int j = m%matrix[0].length;

            // apply BS
            if(target == matrix[i][j]){
                return new int[]{i,j};
            }
            if(target > matrix[i][j]){
                start = m + 1;
            }else {
                end = m - 1;
            }
        }

        return new int[]{-1,-1};
    }
}
