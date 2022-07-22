package com.harsh;

import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.
public class Ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
