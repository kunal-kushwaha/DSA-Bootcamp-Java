package com.harsh;
//Input currency in rupees and output in USD.

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        double exchangeRate = 79.92;  // rate is as per 16-07-2022 exchange rate
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in INR");
        double amount = sc.nextDouble();
        System.out.println("Amount in USD: " + (amount*exchangeRate));
    }
}
