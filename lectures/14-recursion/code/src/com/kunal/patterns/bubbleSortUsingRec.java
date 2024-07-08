import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    int[] arr={4,2,3,1,9,43,24,5};
	    
	    bubbleSort(arr,arr.length-1,0);
        
        System.out.println(Arrays.toString(arr));
	}
	static void bubbleSort(int[] arr,int r,int c){
	    if(r==0){
	        return;
	    }
	    
	    if(c<r){
	        if(arr[c]>arr[c+1]){
	            int temp=arr[c];
	            arr[c]=arr[c+1];
	            arr[c+1]=temp;
	           
	        }
	        
	         bubbleSort(arr,r,c+1);
	        
	    }
	    else{
	        
	        bubbleSort(arr,r-1,0);
	    }
	}
}
