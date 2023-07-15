
import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
         int[]arr=new int [n];
         System.out.println("Enter the elements of the array");
         for(int i=0;i<n;i++){
             arr[i]=in.nextInt();
         }
        bubbleSort(arr);
        System.out.println("The Sorted elements of the array are:"+Arrays.toString(arr));
        in.close();
    }
  static void bubbleSort(int[]arr){
    boolean swapped;
    for(int i=0;i<arr.length;i++){
        swapped=false;
        for(int j=1;j<arr.length-i;j++){
        if(arr[j]<arr[j-1]){
         int temp=arr[j];
         arr[j]=arr[j-1];
         arr[j-1]=temp;
         swapped=true;
        }
        }
        if(!swapped){
            break;
        }
    }
  }
}
