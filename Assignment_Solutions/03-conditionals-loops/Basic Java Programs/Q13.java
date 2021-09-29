// 13. Perimeter of Rhombus

import java.util.Scanner;
public class Q13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will calculate Perimeter of Rhombus.");
		System.out.println("Enter the lenght of any side of Rhombus: ");
		float length = input.nextFloat();

		float PerimeterOfRhombus = 4*length;

		System.out.println("Perimeter of Rhombus = " + PerimeterOfRhombus);

	}
}