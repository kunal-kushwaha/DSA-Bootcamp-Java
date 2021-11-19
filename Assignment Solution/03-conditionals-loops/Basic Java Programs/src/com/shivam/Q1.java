package com.shivam;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
//        Ques 1 -->  Area Of Circle Java Program
        Scanner in =new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float radius =in.nextFloat();
        double pi=Math.PI;
        double area =pi*(radius*radius);
        System.out.printf("%.2f",area);
    }
}
