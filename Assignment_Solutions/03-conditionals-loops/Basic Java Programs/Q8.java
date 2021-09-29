// 8. Perimeter Of Circle

import java.util.Scanner;
public class Q8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("program to find the perimeter or circumference of circle");
		System.out.println("Enter the radius of circle to find the circumference of circle: ");
		float radius = input.nextFloat();

		float pi = 3.141f;
		float PerimeterOfCircle = 2*pi*radius;

		System.out.println("Perimeter of circle = " + PerimeterOfCircle + " units"); 
	}
}