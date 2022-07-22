package com.harsh.Basic;

import java.util.Scanner;
// Curved Surface Area Of Cylinder
public class Ques19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Enter height: ");
        double h = sc.nextDouble();

        System.out.println("Curved Surface Area: "+ 2*Math.PI*r*h);
    }
}
