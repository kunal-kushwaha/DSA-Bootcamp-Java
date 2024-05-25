package com.ajit;

import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();

        System.out.println("Sum of two numbers:"+(int)(num1+num2));
    }
}
