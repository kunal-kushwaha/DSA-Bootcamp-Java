import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a year to check wheter it is a leap year or not: ");
		int year = input.nextInt();

		if (year%4 == 0 && year%100 != 0 || year%400 == 0)
			System.out.println("it's a leap year");
		else
			System.out.println("it's a normal year");
	}
}