package com.harsh.Basic;

import java.util.Scanner;

// Volume Of Pyramid
public class Ques18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base length: ");
        double l = sc.nextDouble();
        System.out.println("Enter base width: ");
        double w = sc.nextDouble();
        System.out.println("Enter the pyramid height");
        double h = sc.nextDouble();

        System.out.println("Volume: "+(l*w*h)/3);
    }
}
