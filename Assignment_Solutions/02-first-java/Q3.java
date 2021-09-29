
// 3. Write a program to input principle, time, and rate (P, T, R) from the user and
// find Simple Interest.

import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter principle, time and rate to find Simple Interest: ");
		float principle = input.nextFloat();
		float time = input.nextFloat();
		float rate = input.nextFloat();

		float SimpleInterest = (principle * time * rate)/100;

		System.out.println("Simple Interest = " + SimpleInterest);
	}
}