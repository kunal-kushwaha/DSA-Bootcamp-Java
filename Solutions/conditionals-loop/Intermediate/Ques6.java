package Intermediate;

import java.util.Scanner;

// Calculate Commission Percentage
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the commission amount: ");
        float commission = sc.nextFloat();
        System.out.println("Enter the amount: ");
        float amount = sc.nextFloat();

        System.out.println("Commission Percentage: " + ((commission/amount)*100) +"%");
    }
}
