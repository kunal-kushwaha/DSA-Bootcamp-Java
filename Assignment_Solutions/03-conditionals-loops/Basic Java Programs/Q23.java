// 23. Input a number and print all the factors of that number (use loops)
import java.util.Scanner;

public class Q23 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter any number to find out it's all factors: ");
		int number = input.nextInt();
		int counter = 1;
		while(counter <= number) {
			if(number % counter == 0) {
				System.out.print(counter + " ");
			}
			counter += 1;
		}
	}
}