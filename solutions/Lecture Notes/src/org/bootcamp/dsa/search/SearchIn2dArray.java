package org.bootcamp.dsa.search;

import java.util.Arrays;

public class SearchIn2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
		
		int target = 56;
		int[] ans = search(arr,target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));
        
        System.out.println(max(arr));

        System.out.println(Integer.MIN_VALUE);
		
	}
	
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col}; // creating a nerw array whic is to be returned to the method mentioned.
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;// this is a better way of initialising the starting value while finding the max value.
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

}
