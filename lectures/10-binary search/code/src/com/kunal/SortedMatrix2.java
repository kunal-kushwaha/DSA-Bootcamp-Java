package com.Kamal;

import java.util.Arrays;

public class SortedMatrix2 {
    public static void main(String[] args) {
            int[][] array={
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
            };

        int[][] array2={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int[][] array3={
                {1,2},
                {5,6},
                {9,10},
                {13,14}
        };

        System.out.println(Arrays.toString(search(array,6)));
        System.out.println(Arrays.toString(search(array,16)));
        System.out.println(Arrays.toString(search(array,19)));
        System.out.println(Arrays.toString(search(array2,11)));
        System.out.println(Arrays.toString(search(array2,16)));
        System.out.println(Arrays.toString(search(array3,14)));
        System.out.println(Arrays.toString(search(array3,0)));
        System.out.println(Arrays.toString(search(array3,16)));
        int[][] array4={
                {1,2},
                {5,6},
        };
        System.out.println(Arrays.toString(search(array4,5)));
        System.out.println(Arrays.toString(search(array4,7)));
        int[][] array5={
                {1,2,3,4},
                {5,6,7,8},
        };
        System.out.println(Arrays.toString(search(array5,5)));
        System.out.println(Arrays.toString(search(array5,7)));
        System.out.println(Arrays.toString(search(array5,11)));
        System.out.println(Arrays.toString(search(array5,-1)));

        int[][] array6={
                {1},
                {2},
                {3}
        };
        System.out.println(Arrays.toString(search(array6,3)));
        System.out.println(Arrays.toString(search(array6,4)));
    }

    /**
     *
     * @param matrix
     * @param col
     * @param rowStart
     * @param rowEnd
     * @param target
     * @return
     */
    public static int[] binarySearch(int[][] matrix, int col, int rowStart, int rowEnd, int target) {
        while (rowStart <= rowEnd) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[mid][col] == target) {
                return new int[]{mid, col};
            }
            if (matrix[mid][col] < target) {
                rowStart = mid + 1;
            } else {
                rowEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * @param matrix
     * @param target
     * @return O/P from binarySearch method
     */
    public static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious matrix may be empty.
        if(cols==1){
            return  binarySearch(matrix,0,0,rows-1, target);
        }
        int midRow = rows/2;

        int colStart=0;
        int colEnd = matrix[0].length-1;

        while(colStart<(colEnd-1)){//while this is true, it will have more than 2 cols.
            int mid=colStart + (colEnd-colStart)/2;
            if(matrix[midRow][mid] == target){
                return new int[]{midRow, mid};
            }

            if(matrix[midRow][mid] < target){
                //Ignore the above cols
                colStart = mid;
            }else{
                colEnd=mid;
            }
        }

        //now we have 2 cols
        //Check whether the target is in the row of the two columns.
        if (matrix[midRow][colStart] == target) {
            return new int[]{midRow, colStart};
        }

        if (matrix[midRow][colStart+1] == target) {
            return new int[]{midRow, colStart+1};
        }
        //otherwise
        //Search in 1st half
        if(target <= matrix[midRow-1][colStart]){
            return binarySearch(matrix, colStart, 0, midRow-1, target);
        }
        //Search in 2nd half
        if(midRow+1<rows && target >= matrix[midRow+1][colStart] &&target <= matrix[rows-1][colStart]  ){
            return binarySearch(matrix, colStart, midRow+1, cols-1, target);
        }
        //Search in 3rd half
        if(target <= matrix[midRow-1][colStart+1]){
            return binarySearch(matrix, colStart+1, 0, midRow-1, target);
        }else{
            return binarySearch(matrix, colStart+1, midRow+1, rows-1, target);
        }

    }
}
