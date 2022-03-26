package sortingalgo;

import java.util.Arrays;

public class QuickSortUsingCornerElement {
    public static void main(String[] args) {
        int[] arr =  {-1 , 1, 3, 5, 4};
        quicksort(arr, 0, arr.length - 1 );
        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int arr[], int l, int h){

        if(  l >= h)
            return;

        int p = partition(arr, l , h);
        quicksort(arr, l , p - 1);
        quicksort(arr, p + 1, h);

    }

    public static int  partition(int arr[], int l, int h){
        int pivot  = arr[h];
        int i  = l -1;
        for(int  j =l ; j<h; j++){

            if(pivot > arr[j]){
                i += 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]  = temp;
            }
        }
        i +=  1;

        int temp = arr[i];
        arr[i] = arr[h];
        arr[h] = temp;
        return i;
    }
}
