package SolvedProblems.Recursion;

import java.util.Arrays;

public class SelectionSort {
    static void easySelectionSort(int[] arr, int last, int index, int max){
        if(last == 0){
            return;
        }

        if(index < last){
            if(arr[index] > arr[max]){
                easySelectionSort(arr, last, index + 1, index);
            }
            else{
                easySelectionSort(arr, last, index + 1, max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;

            easySelectionSort(arr, last - 1, 0, 0);
        }
    }

    static int findingMax(int[] arr, int max, int endIndex){
        if(endIndex == -1){
            return max;
        }

        if(arr[endIndex] > arr[max]){
            max = endIndex;
        }

        return findingMax(arr, max, endIndex - 1);
    }

    static void selectionSort(int[] arr, int index, int lastIndex){
        if(lastIndex == 0){
            return;
        }

        if(index < lastIndex){
            int max = findingMax(arr, 0, lastIndex);

            int temp = arr[lastIndex];
            arr[lastIndex] = arr[max];
            arr[max] = temp;

            selectionSort(arr, 0, lastIndex - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,15,4,3,2,1};
        // selectionSort(arr, 0, arr.length - 1);
        easySelectionSort(arr, arr.length - 1, 0, 0);

        System.out.println(Arrays.toString(arr));

    }
}
