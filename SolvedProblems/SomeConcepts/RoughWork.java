package SolvedProblems.SomeConcepts;

import java.util.Arrays;

public class RoughWork {
    public static int[] cyclicSort(int[] arr) {
        for (int i = 0; i < arr.length; ) {
            int checkIndex = arr[i] - 1; 
            if(arr[i] != arr[checkIndex]){
                int temp = arr[i];
                arr[i] = arr[checkIndex];
                arr[checkIndex] = temp;
            }
            else{
                i++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 1, 8, 2, 3, 7, 6, 4, 5 };
        arr = cyclicSort(arr);
        System.out.println("Cyclic sort: " + Arrays.toString(arr));
    }
}

