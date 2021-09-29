
//4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)

import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two number: ");
		float num1 = input.nextFloat();
		float num2 = input.nextFloat();

		System.out.println("Enter any operator (+, -, *, /, %): ");
		char operator = input.next().trim().charAt(0);

		if(operator == '+') {
			float result;
			result = num1 + num2;
			System.out.println("result = " + result);
		}
		if(operator == '-') {
			float result;
			result = num1 - num2;
			System.out.println("result = " + result);
		}
		if(operator == '*') {
			float result;
			result = num1 * num2;
			System.out.println("result = " + result);
		}
		if(operator == '/') {
			float result;
			result = num1 / num2;
			System.out.println("result = " + result);
		}
		if(operator == '%') {
			float result;
			result = num1 % num2;
			System.out.println("result = " + result);
		}
	}
}