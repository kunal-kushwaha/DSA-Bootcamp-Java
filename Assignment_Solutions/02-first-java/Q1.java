
// 1. Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter any number two check whether it is even or odd: ");
		int number = input.nextInt();

		if(number%2==0) {
			System.out.println(number + " is Even");
		}
		else
			System.out.println(number + " is Odd");
	}
}