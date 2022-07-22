package com.harsh.Basic;

import java.util.Scanner;

// Perimeter Of Parallelogram
public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        double a = sc.nextDouble();
        System.out.println("Enter side: ");
        double b = sc.nextDouble();

        System.out.println("Perimeter: "+ 2*(a+b));
    }
}
