package com.My_first_Project;

public class Parttterns9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parttterns9(4);
	}
		static void Parttterns9(int n) {
	        int originalN = n;
	        n = 2 * n;
	        for (int row = 0; row <= n; row++) {
	            for (int col = 0; col <= n; col++) {
	                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
	                System.out.print(atEveryIndex + " ");
	            }
	            System.out.println();
	        }
	    }
	}


