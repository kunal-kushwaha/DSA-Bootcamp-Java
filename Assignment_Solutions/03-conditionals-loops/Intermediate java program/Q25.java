// sum of the digit of a number.
import java.util.*;
public class Q25 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int number = in.nextInt();

		int sum = 0;
		int temp = number;
		while(temp>0) {
			int lastdigit = temp ;
			lastdigit %= 10;
			sum += lastdigit;
			temp /= 10;
		}

		System.out.println("Sum of digits of " + number + " is " + sum);

	}
}