package com.shivam;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a,b,perimeter;
        System.out.println("Enter Base");
        b=in.nextFloat();
        System.out.println("Enter Side");
        a=in.nextFloat();
        perimeter=2*(a+b);
        System.out.println("Perimeter : " + perimeter);

    }
}
