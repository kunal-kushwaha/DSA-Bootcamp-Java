// 25. Take integer inputs till the user enters 0 and print the largest number from
// all.

import java.util.Scanner;

public class Q25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int LargestNumber = 0;
		int lastnumber = 0;
		System.out.println("Input numbers to find the largest between them and enter 0 to stop: ");
		while(true) {
			int number = input.nextInt();
			if(number == 0 )
				break;
			else if(number > lastnumber)
				LargestNumber = number;

			lastnumber = number;
		}
		System.out.println("Largest Number = " + LargestNumber);
	}
}