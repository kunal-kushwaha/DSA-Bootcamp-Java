// 1. Area Of Circle Java Program.

import java.util.Scanner;
public class Q1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Program to find Area of Circle");
		System.out.print("Enter radius: ");
		float radius = input.nextFloat();

		float pi = 3.141f;
		float AreaOfCircle = (pi*radius*radius);

		System.out.println("Area of Circle = " + AreaOfCircle + "sq.units");
	}
}
