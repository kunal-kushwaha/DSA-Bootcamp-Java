//Binary Search in 2-D array

import java.util.*;

public class Ajit {
    public static void main(String[] args){
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13 , 14, 15, 16}
        };

        int target = 6;

        System.out.println(Arrays.toString(search(arr,target)));

    }
    public static int[] search(int[][] arr, int target){
        int rows = arr.length; // length of row
        int cols = arr[0].length; //length of column

        int rStart = 0;
        int rEnd = rows -1;
        int cMid = (cols-1) / 2;

        //reducing the matrix to two rows
        //reducing the search space to two rows
        while (rStart < (rEnd-1)) {
            int rMid = rStart + (rEnd - rStart) / 2;

            if (target == arr[rMid][cMid]) {
                return new int[] {rMid, cMid};
            }

            if (target < arr[rMid][cMid]) {
                rEnd = rMid;
            } else {
                rStart = rMid;
            }
        }

        //now we have two rows after the while loop is over
        if (target == arr[rStart][cMid]) {
            return new int[] {rStart, cMid};
        }
        if (target == arr[rEnd][cMid]) {
            return new int[] {rEnd, cMid};
        }

        //four cases

        //search in 1st half
        if (target <= arr[rStart][cMid - 1]) {
            return binarySearch(arr,target,rStart,0,cMid-1);
        }

        //search in 2nd half
        if (target >= arr[rStart][cMid+1] && target <= arr[rStart][cols-1]) {
            return binarySearch(arr,target,rStart,cMid+1,cols-1);
        }

        //search in 3rd half
        if (target <= arr[rEnd][cMid - 1]) {
            return binarySearch(arr,target,rEnd,0,cMid-1);
        }

        //search in 4th half
        else {
            return binarySearch(arr, target,rEnd,cMid+1,cols-1);
        }
    }
    
    //normal binary search algorithm 
    public static int[] binarySearch(int[][] arr, int target, int row, int cStart, int cEnd) {
        while (cStart <= cEnd) {
            //find the middle element
            int cMid = cStart + (cEnd - cStart) / 2;

            if (target == arr[row][cMid]) {
                return new int[] {row, cMid};
            }

            if (target < arr[row][cMid]) {
                cEnd = cMid - 1;
            } else {
                cStart = cMid + 1;
            }
        }
        return new int[] {-1, -1};
    }
}
