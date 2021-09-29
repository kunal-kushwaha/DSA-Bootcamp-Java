// 4. Area of Isosceles trianlge

import java.util.*;
public class Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program will calculate Area of Isosceles trianlge.");
		System.out.println();

		System.out.print("Enter equal sides of Isosceles trianlge: ");
		// in isosceles triangle two sides are always equal
		float EqualSides = input.nextFloat();
		System.out.print("Enter the base/unequal of the Isosceles trianlge: ");
		// the unequal side is the base of the isosceles triangle 
		float base = input.nextFloat();

		double height = Math.sqrt((EqualSides*EqualSides) - (base*base)/4); 
		// To find the height we divide base using perpendicular bisecotr
		// base = (base/2) and the two side become hypotenus and then put pythagorean theorem 
		System.out.println("height = " + height);

		double AreaOfIsoscelesTriangle = (0.5f * base * height);
		System.out.println("Area of Isosceles triangle = " + AreaOfIsoscelesTriangle);
	}
}