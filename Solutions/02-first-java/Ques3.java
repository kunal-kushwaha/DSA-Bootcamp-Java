package com.harsh;

import java.util.Scanner;

//  Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        float amount = sc.nextFloat();
        System.out.println("Enter the rate: ");
        float rate = sc.nextFloat();
        System.out.println("Enter the time in year: ");
        float time = sc.nextFloat();

        float simpleIntrest = (amount*rate*time)/100;
        System.out.println("simple Interest: "+simpleIntrest);
    }
}
