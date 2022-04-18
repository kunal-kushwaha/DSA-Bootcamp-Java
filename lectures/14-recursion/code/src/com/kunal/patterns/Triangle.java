package com.kunal.patterns;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
//        triangle2(4, 0);
        int[] arr = {1, 4, 3, 5};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c+1);
            System.out.print("*");
        } else {
            triangle2(r-1, 0);
            System.out.println();
        }
    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle(r, c+1);
        } else {
            System.out.println();
            triangle(r-1, 0);
        }
    }


    static void bubble(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {

            if (arr[c] > arr[c+1]) {
                // swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            bubble(arr, r, c+1);
        } else {
            bubble(arr, r-1, 0);
        }
    }

    public static void bubbleSort(int[] arr,int row,int column,int max)
    {
        if(row == 0)
        {
            return;
        }
        if(column <= row)
        {
            if(arr[column] > arr[max])
            {
                bubbleSort(arr,row,column+1,column);
            }
            else
            {
                bubbleSort(arr,row,column+1,max);
            }
        }
        else
        {
            int temp = arr[max];
            arr[max] = arr[row];
            arr[row] = temp;
            bubbleSort(arr, row - 1, 0, 0);
        }
    }
    }


}
