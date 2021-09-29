// 18. volume of pyramid
import java.util.Scanner;
public class Q18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will calculate Volume of Pyramid.");

		System.out.println("Enter the base length, base width and pyramid height: ");
		float BaseLength = input.nextFloat();
		float BaseWidth = input.nextFloat();
		float PyramidHeight = input.nextFloat();

		float VolumeOfPyramdi = (BaseLength*BaseWidth*PyramidHeight)/3;

		System.out.println("Volume of Pyramid = " + VolumeOfPyramdi);

	}
}