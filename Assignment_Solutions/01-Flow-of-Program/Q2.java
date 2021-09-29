import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter two number: ");

		float num1 = input.nextFloat();
		float num2 = input.nextFloat();

		float sum = num1 + num2;
		System.out.println("sum = " + sum);
	}
}