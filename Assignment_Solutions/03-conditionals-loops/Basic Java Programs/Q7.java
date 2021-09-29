//Area of Equilateral triangle

import java.util.Scanner;
public class Q7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program will calculate Area of Equilateral triangle.");
		System.out.println();

		System.out.println("Enter any side of Equilateral triangle: ");
		float side = input.nextFloat();

		// To find out height we will use a perpendicular bisector
		// base = (base/2) and other two sides become hypotenus and then put pythagorean theorem
		double height = Math.sqrt((side*side) - (side*side)/4); 

		double AreaOfEquilateralTriangle = 0.5f * side * height;  

		System.out.println("Area of Equilateral triangle = " + AreaOfEquilateralTriangle);
	}
}