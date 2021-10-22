package com.My_first_Project;

public class Partterns5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partterns5(5);
	}
		static void Partterns5(int n) {
	        for (int row = 0; row < 2 * n; row++) {
	            int totalColsInRow = row > n ? 2 * n - row: row;
	            for (int col = 0; col < totalColsInRow; col++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}


