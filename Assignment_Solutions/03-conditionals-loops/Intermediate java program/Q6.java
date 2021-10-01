// claculate commision percentage

import java.util.Scanner;
public class Q6 {
	public static void main(String ... args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount: ");	
		float amount = in.nextFloat();

		System.out.print("Enter commission percentage: ");
		float commissionPercentage = in.nextFloat();

		float commission = amount*commissionPercentage/100;

		System.out.println("Total commission from " + amount + " is " + commission);
	}
}