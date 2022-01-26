package org.bootcamp.dsa.search;

/*
 * Search a particular numbr in the range of indices of array
 */
public class SearchInRange {

	//sarch for 3 in the range from range fo index 1 to 4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {18, 12, -7, 3, 14, 28} ;
		
		int target = 18 ;
		
		int start= 1, end = 4;
		
		boolean result = findTheNumInRange(arr, target, start, end);		
		
		System.out.println(result);

	}

	private static boolean findTheNumInRange(int[] arr, int target, int start, int end) {
		
		boolean result = false;
		for (int i = start; i <= end; i++) {
			//result = (arr[i]==target)? true:false ;
			if(arr[i]==target)
				result = true;
		}
				
		return result;
	}

}
