// 17. Volume of sphere.

import java.util.*;
public class Q17 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("This program will calculate Volume of Sphere");

		System.out.println("Enter the radius of Sphere: ");
		float radius = input.nextFloat();

		float pi = 3.141f;
		float VolumeOfSphere = 1.33333f*pi*(radius*radius*radius);

		System.out.println("Volume of Sphere = " + VolumeOfSphere );
	}
}