// 6. Input currency in rupees and output in USD.

import java.util.Scanner;
public class Q6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter currency in rupees: ");
		float CurrencyInRuppes = input.nextFloat();

		float CurrencyInDollars = CurrencyInRuppes/74.29F; // today(28-Sept-2021) 1 dollar = 74.29 ruppes 

		System.out.println("Currency in dollars: " + CurrencyInDollars + "$");
	}
}