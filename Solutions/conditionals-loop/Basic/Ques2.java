package com.harsh.Basic;

import java.util.Scanner;

// Area Of Triangle
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        double base = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        System.out.println("Area: " + (0.5*base*height));
    }
}
