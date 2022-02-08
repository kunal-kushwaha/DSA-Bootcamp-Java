import java.util.Arrays;

public class Bubblesorts {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        bubble(nums,nums.length-1, 0 );
        System.out.println(Arrays.toString(nums));


    }
    static void bubble(int[] arr , int r , int c){
        if(r==0){
            return;
        }

        if(c<r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c]  = arr[c+1];
                arr[c+1] = temp ;
            }
             bubble(arr, r, c+1);
        }
        else {
             bubble(arr , r-1, 0);
        }

    }
}
