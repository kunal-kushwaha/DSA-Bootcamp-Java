package com.My_first_Project;

public class Partterns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partterns1(5);
    }
		 static void Partterns1(int n) {
		        for (int row = 1; row <= n; row++) {
		            // for every row, run the col
		            for (int col = 1; col <= n; col++) {
		                System.out.print("* ");
		            }
		            // when one row is printed, we need to add a newline
		            System.out.println();
		        }
		    }
	}

