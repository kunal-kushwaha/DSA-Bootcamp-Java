import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target element");
        int target=in.nextInt();
        int start=0;
        int end=arr.length-1;
        System.out.println("Element found at index "+binarySearch(arr, target, start, end));
        in.close();

    }
    static int binarySearch(int[]arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int middle=start+(end-start)/2;
        if(arr[middle]==target){
            return middle;
        }
        if(target<arr[middle]){
         return  binarySearch(arr, target, start, middle-1);
        }
        return binarySearch(arr, target, middle+1, end);
    }
}
