import java.util.*;

public class Insertionsort{
    public static void main(String[] args) {
        // int[]arr={5,3,2,1};
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=in.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        insertion(arr);
         System.out.println("Sorted Array is:"+Arrays.toString(arr));
         in.close();
    }
    static void insertion(int[]arr){
        for(int i=0;i<arr.length-1;i++){
         for(int j=i+1;j>0;j--){
            if(arr[j]<arr[j-1]){
                int temp=arr[j-1];
               arr[j-1]=arr[j];
               arr[j]=temp;
            }
            else{
                break;
            }
         }   
        }
    }
}