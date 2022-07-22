package com.harsh.Basic;

import java.util.Scanner;

// Perimeter Of Circle
public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r = sc.nextDouble();

        System.out.println("Circumference: "+ (2*Math.PI*r));
    }
}
