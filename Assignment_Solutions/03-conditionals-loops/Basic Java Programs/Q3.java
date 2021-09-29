// 3. Area of Rectangle

import java.util.Scanner;
public class Q3 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program will calculate Area of Rectangle");
		System.out.println();

		System.out.println("Enter the lenght and width of Rectangle: ");
		float length = input.nextFloat();
		float width = input.nextFloat();

		float AreaOfRectangle = length*width;
		System.out.println("Area of Rectangle = " + AreaOfRectangle);
	}
}