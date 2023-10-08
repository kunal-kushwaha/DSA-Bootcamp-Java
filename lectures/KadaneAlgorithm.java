
/*
Kadane's Algo :  Maximum sub-array ending at the (i)th index is either the current element,
                 A[i]  or the current element combined with the maximum sub-array ending at the (i-1)th index.
*/


/*
Time Complexity : O(N)
*/

public class MaxSubArray {

    public int maxSumOfSubArray(int[] arr){
        int max_current = arr[0];
        int max_global = arr[0];

        for(int i = 1;i<arr.length-1;i++){
            max_current = Math.max(arr[i], max_current + arr[i] );

            if(max_current>max_global){
                max_global = max_current;
            }
        }

        return max_global;
    }

    public static void main(String[] args) {
        MaxSubArray obj = new MaxSubArray();

        int[] arr = {4, -1, 2, -1, 6, -7};
        System.out.println(obj.maxSumOfSubArray(arr));
    }
}
