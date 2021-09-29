// 11. perimeter of Rectangle

import java.util.Scanner;
public class Q11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will calculate perimeter of Rectangle");

		System.out.println("Enter the length and width of Rectangle: ");
		float length = input.nextFloat();
		float width = input .nextFloat();

		float PerimeterOfRectangle = 2*length + 2*width;

		System.out.println("Perimeter of Rectangel = " + PerimeterOfRectangle);
	}
}