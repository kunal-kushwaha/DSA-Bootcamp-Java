// Fibonacci series in java program
import java.util.Scanner;

public class Q21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Program to print fibonacci series."); 

		System.out.println("Enter till what number you want to print the series: ");	
		int num = input.nextInt();

		int a = -1, b = 1, temp = 0;
		int counter = 1;
		while(counter <= num) {
			temp = a+b;
			System.out.println(temp + " ");
			a = b;
			b = temp;
			counter ++ ;
		}
	}
}