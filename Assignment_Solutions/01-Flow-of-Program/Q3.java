import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter any integer to print it's multiplication table: ");
		int number = input.nextInt();

		int counter = 1;
		while(counter <= 10) {
			System.out.println(number + " x " + counter + " = " + number*counter);
			counter += 1;
		}
	}
}