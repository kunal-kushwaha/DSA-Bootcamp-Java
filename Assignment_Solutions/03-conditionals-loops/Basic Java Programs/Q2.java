// 2. Area of triangle 

import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program will calculate Area of Trianlge.");
		System.out.println("Enter the height and base of the triangle: ");
		float height = input.nextFloat();
		float base = input.nextFloat();

		float AreaOfTrianlge = (0.5f*height*base);
		System.out.println("Area of Triangle = " + AreaOfTrianlge);
	}
}