package com.harsh.Basic;

import java.util.Scanner;

// Perimeter Of Rectangle
public class Ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        double l = sc.nextDouble();
        System.out.println("Enter width: ");
        double w = sc.nextDouble();

        System.out.println("Perimeter: "+ 2*(l+w));
    }
}
