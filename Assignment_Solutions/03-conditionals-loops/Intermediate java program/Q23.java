// The number is perfect number or not 
import java.util.*;
public class Q23 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int number = in.nextInt();
		int sum = 0;

		for(int i = 1 ; i<number; i++) {
			if(number % i == 0 ) {
				sum += i;
			}
		}

		if(sum == number) {
			System.out.println("yes it's a perfect number.");
		}
		else
			System.out.println("No it's not a perfect number");
	}
}