package com.harsh.Basic;

import java.util.Scanner;

//Volume Of Sphere
public class Ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r = sc.nextDouble();

        System.out.println("Volume: "+ (4/3)*Math.PI*Math.pow(r, 3));
    }
}
