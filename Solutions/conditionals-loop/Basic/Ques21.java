package com.harsh.Basic;

import java.util.Scanner;

// Fibonacci Series In Java Programs
public class Ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c=a+b;
            a = b;
            b = c;
        }
    }
}
