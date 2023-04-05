package SolvedProblems.Recursion;

public class MaxAndMin {
    public static void minMax(int[] arr, int min, int max, int i) {
        if (i == arr.length - 1) {
            System.out.println("Min: " + min + " Max: " + max);
            return;
        }
        if (max < arr[i]) {
            max = arr[i];
        }
        if (min > arr[i]) {
            min = arr[i];
        }

        minMax(arr, min, max, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, -5, -4, 8, 6 };
        minMax(arr, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
    }
}
