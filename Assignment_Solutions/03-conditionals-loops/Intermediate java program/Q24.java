// check leap year or not 
import java.util.*;
public class Q24 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year to check whether it is a leap year or not: ");
		int year = in.nextInt();

		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("Leap year");
		}
		else
			System.out.println("Not a Leap year.");
	}
}