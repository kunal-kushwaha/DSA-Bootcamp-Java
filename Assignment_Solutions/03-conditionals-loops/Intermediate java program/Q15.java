// Armstrong numbers in java using functoin

import java.util.Scanner;
public class Q15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Armstrong Number from 1 to 1000"); 
		for(int i = 1; i <= 1000; i++) {
			ArmstrongNumber(i);
		}
	}

	static void ArmstrongNumber(int x) {
		int rem = 0, cube  = 1, sum = 0;

		int temp = x;
		while(temp > 0) {
			rem = temp % 10;
			cube = rem * rem * rem;
			sum += cube;
			temp /= 10;
		}
		if(sum == x) {
				System.out.println(x + " ");
			}
		sum = 0;
	}

}