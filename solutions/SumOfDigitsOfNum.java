package org.dsawithkunal.conditionals;

import java.util.Scanner;

public class SumOfDigitsOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the number for which you want to find the sum of digits \nNumber =");
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int sum = 0 ;
		int digit = 0;
		while(num>0) {
			digit = num%10;
			sum = sum + digit;
			num = num/10;
		}
		System.out.println("The Sum of each digits for the given number is " + sum);
	}

}
