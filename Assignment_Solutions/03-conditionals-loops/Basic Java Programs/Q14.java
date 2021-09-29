// 14. Volume of Cone in java

import java.util.*;
public class Q14 {
	public static void main(String ...args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will calculate Volume of Cone");

		System.out.println("Enter the height and radius of Cone: ");
		float height = input.nextFloat();
		float radius = input.nextFloat();

		float pi = 3.141f;
		float VolumeOfCone = (pi * radius * radius * height)/3;

		System.out.println("Volume of Cone = " + VolumeOfCone); 
	}
}