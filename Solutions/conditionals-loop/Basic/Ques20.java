package com.harsh.Basic;

import java.util.Scanner;

// Total Surface Area Of Cube
public class Ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side: ");
        double a = sc.nextDouble();

        System.out.println("Total Surface Area: "+ 6*Math.pow(a, 2));
    }
}
