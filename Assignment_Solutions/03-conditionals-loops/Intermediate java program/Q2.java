/* 
2. calculate electricity bill?

a consumer consumes 500 watts per hour daily for one month.  
Calculate the total energy bill of that consumer if per unit rate is 7? 
( In $, £, €, INR, DHR, Riyal etc) [Take 1 month = 30 Days].
*/

import java.util.*;
import java.io.*;
public class Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float PerUnitRate = 7;
		float ConsumingWattsPerHour = 500; 
		float ConsumingWattsPerMonth = 30*24*ConsumingWattsPerHour;

		// 1 unit = 1Kilowatt
		float UnitsPerMonth = ConsumingWattsPerMonth/1000;

		// total Charges in one month
		float Charges = PerUnitRate *  UnitsPerMonth;


		// for different currencies
		float ElectricityBillInRupees = Charges;
		float ElectricityBillInDolars = Charges / 70;
		float ElectricityBillInEuro = Charges / 85;
		float ElectricityBillInDirham = Charges / 20.206f;
		float ElectricityBillInRiyal = Charges / 19.79f;

		System.out.print("Enter your Currency from ");
		System.out.println("Rupees, Dollars, Euro, Dihram, Riyal:  ");
		String currency = input.next();
		switch(currency) {
			case "Rupees" -> System.out.println("Electricity Bill = " + ElectricityBillInRupees + " rs");
			case "Dollars" -> System.out.println("Electricity Bill = " + ElectricityBillInDolars + " $");
			case "Euro" -> System.out.println("Electricity Bill = " + ElectricityBillInEuro);
			case "Dihram" -> System.out.println("Electricity Bill = " + "ADE " + ElectricityBillInDirham);
			case "Riyal" -> System.out.println("Electricity Bill = " + ElectricityBillInRiyal);
		}


	}
}