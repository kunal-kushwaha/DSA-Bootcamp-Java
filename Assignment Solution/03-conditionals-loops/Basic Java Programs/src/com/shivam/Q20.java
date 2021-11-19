package com.shivam;
import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a,surf_area;
        System.out.println("Enter length of cube");
        a=in.nextFloat();
        surf_area=6*(a*a);
        System.out.println("Total Surface Area Of Cube ");
        System.out.printf("%.2f",surf_area);
    }
}
