package com.ishaan;

import java.util.Arrays;

public class SortedMatrix {
	public static void main(String[] args) { 
		int[][] a = {{10,25,28},
                      {30,34},
                      {40,50,53,59,90}
                     }; 
		
		System.out.println(Arrays.toString(search(a, 59)));              
	}
	
	static int[] search(int[][] a,int target) {
		if(a.length == 0) return new int[] {-1,-1};        
		
		int rows = a.length;
		int cols = a[0].length;		 // be cautious, matrix may be empty


        for(int i=0;i<rows;i++) {
        	cols=a[i].length;
        	
            if(a[i][cols-1] >= target && target >= a[i][0]) {       //	check whether the target is present in the current row.
                                                                    //  if not then do move to next row (i++)
            	int start=0,end=cols-1;

                //  performing simple binary search
            	while(start <= end) {
            		int mid=start+(end-start)/2;

            		if(a[i][mid] == target) return new int[] {i,mid};
            		else if(a[i][mid] < target) start=mid+1;
            		else end=mid-1;
            	}
            }
        } 
        return new int[] {-1,-1};			//	return if target not present in matrix
	}
}
