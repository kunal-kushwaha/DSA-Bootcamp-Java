package com.shivam;
import java.util.Scanner;
public class Q2 {
//    Ques 2 -->  Take name as input and print a greeting message for that name.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name ");
        String name=sc.nextLine();
        System.out.println("Hello " + name);
    }
}
