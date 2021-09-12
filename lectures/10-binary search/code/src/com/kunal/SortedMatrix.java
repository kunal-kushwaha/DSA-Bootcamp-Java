package com.company;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,  2,  3,  4,  5,  6},
                {7,  8,  9,  10, 11, 12},
                {13,  14,  15,  16, 17, 18},
                {19,  20,  21,  22, 23, 24}
        };
        int target = 17;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] matrix, int target)
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = n-1;
        int mid;
        // find ceiling of the number in the last column to get the row
        // of our target
        while (start<=end)
        {
            mid = start + (end-start)/2;
            if(matrix[mid][m-1]==target)
                return new int[] {mid,m-1};
            else if (matrix[mid][m-1]>target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        int ind = start;
        // check if the lowerbound is greater than the target
        if(start>=n)
            return new int[] {-1,-1};
        // search in the specfic row
        else
        {
            start = 0;
            end = matrix[ind].length-1;
            while (start<=end)
            {
                mid = start + (end - start) / 2;
                if (matrix[ind][mid] == target)
                    return new int[]{ind, mid};
                else if (matrix[ind][mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return new int[] {-1,-1};
    }
}
