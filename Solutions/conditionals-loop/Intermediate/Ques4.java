package Intermediate;

import java.util.Scanner;

// Calculate Discount Of Product
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the market price: ");
        float marketPrice = sc.nextFloat();
        System.out.println("Enter the selling price: ");
        float sellingPrice = sc.nextFloat();

        float discountAmount = marketPrice-sellingPrice;
        float discountPer = (discountAmount/marketPrice)*100;
        System.out.printf("Discount amount: %f \nDiscount percent: %f", discountAmount, discountPer);
    }
}
