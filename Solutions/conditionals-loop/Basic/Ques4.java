package com.harsh.Basic;

import java.util.Scanner;

// Area Of Isosceles Triangle
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        double base = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        System.out.println("Area: "+(base*height)/2);
    }
}
