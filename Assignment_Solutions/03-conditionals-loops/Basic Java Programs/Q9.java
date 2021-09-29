// perimeter of Equilateral Triangle

import java.util.Scanner;
public class Q9 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("This program will calculate perimeter of Equilateral triangle");
		System.out.println("Enter any side of Equilateral triangle: ");
		float side = input.nextFloat();

		float PerimeterOfEquilateralTriangle = 3 * side;
		System.out.println("Perimeter of Equilateral triangle = " + PerimeterOfEquilateralTriangle);
	}
}