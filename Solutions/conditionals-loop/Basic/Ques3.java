package com.harsh.Basic;

import java.util.Scanner;

// Area Of Rectangle Program
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println("Enter breadth: ");
        double breadth = sc.nextDouble();

        System.out.println("Area: " + (length*breadth));
    }
}
