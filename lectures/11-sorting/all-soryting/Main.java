/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {-8,22,-9,67,56,0,78,-366,1000};
	   // bubbleSort(arr);
	   selectionSort(arr);
	    System.out.println(Arrays.toString(arr));
	}
	static void bubbleSort(int[] arr){
	    for(int i=0; i<arr.length-1; i++){
	        boolean swap = false;
	        int j = 0;
	        while(j<arr.length-1-i){
	            if(arr[j]>arr[j+1])
	            {
	            int temp = arr[j+1];
	            arr[j+1]= arr[j];
	            arr[j] = temp;
	            swap = true;
	            }
	            j++;
	        }
	        if(swap == false)
	        break;
	    }
	}
}

