package com.harsh.Basic;

import java.util.Scanner;

// Volume Of Cone
public class Ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Enter height: ");
        double h = sc.nextDouble();

        System.out.println("Volume: " + ((Math.PI*Math.pow(r, 2))*h)/3);
    }
}
