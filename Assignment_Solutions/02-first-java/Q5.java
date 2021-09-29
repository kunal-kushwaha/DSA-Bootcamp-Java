// 5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two numbers: ");
		float num1 = input.nextFloat();
		float num2 = input.nextFloat();

		float LargestNumber = num1>num2 ? num1 : num2;
		System.out.println(LargestNumber + " is the largest number between" + num1 + " and " + num2);
	}
}