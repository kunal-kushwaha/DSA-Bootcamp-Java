package com.harsh;

import java.util.Scanner;

// Take 2 numbers as input and print the largest number.
public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println(Math.max(num1, num2));
    }
}
