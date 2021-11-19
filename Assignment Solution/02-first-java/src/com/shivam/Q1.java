package com.shivam;
import java.util.Scanner;
public class Q1 {
//    Ques 1 -->  Write a program to print whether a number is even or odd, also take input.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number ");
        int num=sc.nextInt();
        if (num%2==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd number");
        }
    }
}
