// 24. Take integer inputs till the user enters 0 and print the sum of all numbers
// (HINT: while loop) 

import java.util.Scanner;

public class Q24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int sum = 0;
			System.out.println("Input Integers to find their sum enter 0 to stop and print the sum: "); 
		while(true) {
			int number = input.nextInt();
			if(number == 0) {
				break ;
			}
			else {
				sum += number;
			}
        }
        System.out.println("Sum = " + sum);
	}
}