package com.My_first_Project;

public class Partterns8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partterns8(5);
	}
		static void Partterns8(int n) {
	        for (int row = 1; row <= n; row++) {

	            for (int space = 0; space < n-row; space++) {
	                System.out.print("  ");
	            }

	            for (int col = row; col >= 1; col--) {
	                System.out.print(col + " ");
	            }
	            for (int col = 2; col <= row; col++) {
	                System.out.print(col + " ");
	            }

	            System.out.println();
	        }
	    }
	}


