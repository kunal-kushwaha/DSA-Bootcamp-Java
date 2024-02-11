import java.util.Scanner;
import java.util.Arrays;

public class QuickSortDescending{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // int[] arr = {5, 3, 4, 1, 2};
        sorting(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

public static int partition(int arr[], int left, int right){
    int pivot = arr[left];
    int i = left;
    for(int j = left + 1; j <= right; j++){
        if (arr[j] > pivot){
            i = i + 1;
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
        }
    }

    int temp = arr[i];
    arr[i] = arr[left];
    arr[left] = temp;

    return i;

}

public static void sorting(int arr[], int left, int right){
    if(left < right)
    {
        int q = partition(arr, left, right);
        sorting(arr, left, q);
        sorting(arr, q + 1, right);
    }
}

}
