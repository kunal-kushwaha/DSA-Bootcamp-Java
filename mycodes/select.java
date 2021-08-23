import java.util.Arrays;

public class select{
    public static void main(String[] args){
        int[] arr={4,2,7,44,1,5,22,8,3};
        int findmax=0;
        for(int i=0;i<arr.length;i++){
            int last = arr.length - i - 1;
             findmax=maxfinder(arr,0,last);
             swap(arr, findmax, last);
        }System.out.println(Arrays.toString(arr));
        
    }
    public static int maxfinder(int[] arr,int start,int end){
       int max=start;
       for(int j=0;j<=end;j++){
           if(arr[j]>arr[max]){
               max=j;
           }
       } return max;
    }
    public static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    }