import java.util.Arrays;
import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        selectionSort(arr);
        System.out.println("The Sorted elements of the array are: " + Arrays.toString(arr));
        in.close();
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
