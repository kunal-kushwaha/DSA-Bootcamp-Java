package SolvedProblems.Recursion;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr, int last, int i){
        if(last == 0){
            return ;
        }

        if(i < last){
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            bubbleSort(arr, last, i + 1);
        } else {
            bubbleSort(arr, last - 1, 0);
        }

    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};

        bubbleSort(arr, arr.length - 1, 0);

        System.out.println(Arrays.toString(arr));
    }
}
