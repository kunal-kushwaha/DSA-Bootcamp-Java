
// Future value investment program 

import java.util.*;
public class Q19 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the present value: ");
		int presentvalue = in.nextInt();
		System.out.println("Enter teh Interest rate: ");
		float interestRate = in.nextFloat();
		System.out.println("Enter the time period: ");
		int time = in.nextInt();

		double FutureValue = presentvalue*Math.pow(1+(interestRate/100),time);
		System.out.println("Future Value = " + FutureValue);
	}
}