package com.harsh.Basic;

import java.util.Scanner;

// Area Of Equilateral Triangle
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side: ");
        double a = sc.nextDouble();

        System.out.println("Area: " + Math.round((Math.sqrt(3))*Math.pow(a, 2)/4));  // returns an integer value because of round method
    }
}
