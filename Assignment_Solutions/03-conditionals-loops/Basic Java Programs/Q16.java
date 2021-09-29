// 16. volume of cylinder

import java.util.*;
public class Q16 {
	public static void main(String ...args ) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program will calculate Volume of cylinder.");
		System.out.println("Enter the height and radius of cylinder: ");
		float height = input.nextFloat();
		float radius = input.nextFloat();

		float pi = 3.141f;
		float VolumeOfCylinder = pi * radius * radius * height;

		System.out.println("Volume of Cylinder = " + VolumeOfCylinder);
	}
}