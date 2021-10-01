// 27. Write a program to print the sum of negative numbers, 
// sum of positive even numbers 
// and the sum of positive odd numbers 
// from a list of numbers (N) entered by the user. 
// The list terminates when the user enters a zero.

import java.util.*;
public class Q27 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the list of number, to stop enter 0.");
		int SumOfNegativeNumbers = 0;
		int SumOfEvenNumber = 0;
		int SumOfOddNumber = 0; 
		while(true) {
			int N = in.nextInt();
			
			if(N == 0)
				break;

			if(N < 0) {
				SumOfNegativeNumbers += N;
			}
			else if(N % 2 == 0) {
				SumOfEvenNumber += N;
			}
			else if(N % 2 != 0) {
				SumOfOddNumber += N;
			}
		}

		System.out.println("Sum of Negative numbers = " + SumOfNegativeNumbers);
		System.out.println("sum of Positive even numbers = " + SumOfEvenNumber);
		System.out.println("Sum of positive odd numbers = " + SumOfOddNumber);
	}
}