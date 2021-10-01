// Calculate Average of N number.

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Put how many numbers you want to enter: ");
		int N = input.nextInt();
		System.out.println("Enter the numbers: ");
		int sum = 0;
		float Avg = 0;
		int counter = 1;
		while(counter <= N)
		{
			int numbers = input.nextInt();
			sum += numbers;
			counter ++;
		}
		Avg = sum / N;
		System.out.println("Average of Numbers = " + Avg);

	}
}	