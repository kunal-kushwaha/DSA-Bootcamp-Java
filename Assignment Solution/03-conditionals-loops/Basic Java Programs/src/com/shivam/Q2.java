package com.shivam;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
//        Ques 2 -->  Area Of Triangle
        Scanner in = new Scanner(System.in);
        float base,height;
        System.out.println("Enter base of triangle");
        base=in.nextFloat();
        System.out.println("Enter height of triangle");
        height=in.nextFloat();
        double area=0.5f*base*height;
        System.out.printf("%.2f",area);
    }
}
