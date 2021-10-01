//  Calculate Discount Of Product
import java.util.*;
import java.io.*;

public class Q4 {
	public static void main(String ... args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Market Price of the Product: ");
		float MarketPrice = in.nextFloat();

		System.out.println("Enter Discount percentage: "); 
		float DiscountPercentage = in.nextFloat();

		float Discount = MarketPrice * DiscountPercentage/100;

		float DiscountedPrice = MarketPrice - Discount;

		System.out.println("Discount = " + Discount);
		System.out.println("Discounted Price = " + DiscountedPrice);
	}
}