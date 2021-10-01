// 18. find if a number is palindorme or not: 

import java.util.Scanner;
public class Q18 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number to check whether it is a palindrome number or not: ");
		int number = in.nextInt();
		IsPalindromeNumber(number);
	}

	static void IsPalindromeNumber(int x) {
		int reverse = 0;
		int temp = x;
		while(temp > 0) {
			int lastdigit = temp % 10;
			reverse = reverse*10 + lastdigit;
			temp /= 10;
		}
		if(reverse == x) {
			System.out.println("It's a palindorme number.");
		}
		else {
			System.out.println("No it is not a palindorme number.");
		}

	}

}