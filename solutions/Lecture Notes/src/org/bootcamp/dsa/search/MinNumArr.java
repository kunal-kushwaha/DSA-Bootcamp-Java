package org.bootcamp.dsa.search;

public class MinNumArr {
	public static void main(String[] args) {
		int[] arr = { 18, 12, 7, 3, 14, 28 };
		System.out.println(min(arr));
	}

	// assume arr.length != 0
	// return the minimum value in the array
	static int min(int[] arr) {
		int ans = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < ans) {
				ans = arr[i];
			}
		}
		return ans;
	}
}
