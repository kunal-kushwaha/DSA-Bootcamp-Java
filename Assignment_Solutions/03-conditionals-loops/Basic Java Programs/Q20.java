// calculate total surface area of Cube

import java.util.Scanner;
public class Q20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will calculate total surface area of cube.");

		System.out.println("Enter the lenght of side of cube: ");
		float SideLenght = input.nextFloat();

		float TotalSurfaceAreaOfCube = 6*SideLenght;

		System.out.println("Total Surface Area of Cube = " + TotalSurfaceAreaOfCube);
	}
}