package com.harsh;
//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + ", ");
            int num3 = num1+num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
