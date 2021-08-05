package com.kunal;

import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the amount in rupees");
        double n = input.nextInt();
        double ans = 0.0134791 * n;
        System.out.println("Amount in USD = " + ans);
    }
}
