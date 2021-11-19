package com.shivam;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
//        Ques 3 -->  Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner sc=new Scanner(System.in);
        int principal,time,rate,simple_int;
        System.out.println("Enter Principal amount");
        principal=sc.nextInt();
        System.out.println("Enter time period");
        time=sc.nextInt();
        System.out.println("Enter rate of interest");
        rate=sc.nextInt();
        simple_int=(principal*rate*time)/100;
        System.out.println("Simple Interest = " + simple_int);
    }
}
