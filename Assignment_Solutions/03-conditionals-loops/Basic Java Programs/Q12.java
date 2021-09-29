// 12 perimeter of Square 	
import java.util.Scanner;
public class Q12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Thisi prgoram will calculate perimeter of Square.");
		System.out.println("Enter the length of side of Sqaure: ");
		float length = input.nextFloat();

		float PerimeterOfSquare = 4*length;
		System.out.println("Perimeter of Sqaure = " + PerimeterOfSquare);
	}
}