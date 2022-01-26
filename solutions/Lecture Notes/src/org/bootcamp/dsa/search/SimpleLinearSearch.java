package org.bootcamp.dsa.search;

public class SimpleLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {18,12,9,14,77,50};
		
		int num = 14 ;
		boolean result = findNumInArr(arr, num);
		
		String msg = (result)? "yes": "no";
		System.out.println(msg);
	}

	private static boolean findNumInArr(int[] arr, int num) {
		// TODO Auto-generated method stub
		boolean result = false;
		
		for (int i : arr) {
			if(num ==i)
				result = true;
		}
		return result;
		
	}

}
