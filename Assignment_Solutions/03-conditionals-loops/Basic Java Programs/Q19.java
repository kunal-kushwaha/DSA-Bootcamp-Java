// 19. calculate curved surface area of Cylinder.
import java.util.Scanner;

public class Q19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program will calculate curved surface area of Cylinder.");
		System.out.println("Enter the radius and height of cylinder: ");
		float radius = input.nextFloat();
		float height = input.nextFloat();

		float pi = 3.141f;
		float CurvedSurfaceAreaOfCylinder = 2*pi*radius*height;

		System.out.println("Curved surface area of Cylinder = " + CurvedSurfaceAreaOfCylinder);
	}
}