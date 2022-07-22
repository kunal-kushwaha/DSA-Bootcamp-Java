package com.harsh.Basic;

import java.util.Scanner;

//Area Of Rhombus
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first diagonal: ");
        double p = sc.nextDouble();
        System.out.println("Enter second diagonal: ");
        double q = sc.nextDouble();

        System.out.println("Area: "+(p*q)/2);
    }
}
