
// 2. Take name as input and print a greeting message for that name.

import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = input.next();

		System.out.println("Hello, " + name + " :)");
	}
}