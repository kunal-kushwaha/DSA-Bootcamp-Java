// 6. Area of rhombus

import java.util.Scanner;
public class Q6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program will calculate Area of Rhombus.");
		System.out.println("Enter the lenght of diagonal of Rhombus: ");
		float diagonal = input.nextFloat();

		float AreaOfRhombus = diagonal*diagonal/2;
		System.out.println("Area of Rhombus = " + AreaOfRhombus);
	}
}