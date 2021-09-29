// 5. Area of parallelogram

import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will calculate Area of parallelogram.");
		System.out.println();

		System.out.println("Enter the base and height of parallelogram: ");
		float base = input.nextFloat();
		float height = input.nextFloat();

		float AreaOfParalellogram = base * height;

		System.out.println("Area of Parallelogram = " + AreaOfParalellogram);
	}
}