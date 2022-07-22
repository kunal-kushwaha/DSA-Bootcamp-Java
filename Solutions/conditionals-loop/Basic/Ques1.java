package com.harsh.Basic;

import java.util.Scanner;

// Area Of Circle Java Program
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();
        System.out.println(2*Math.PI*Math.pow(radius, 2));
    }
}
