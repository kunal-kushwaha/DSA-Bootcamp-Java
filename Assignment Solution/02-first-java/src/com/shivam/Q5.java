package com.shivam;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
//        Ques 5 -->  Take 2 numbers as input and print the largest number.
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter Number 1");
        num1=sc.nextInt();
        System.out.println("Enter number 2");
        num2=sc.nextInt();
        if (num1>num2){
            System.out.println("Largest number " + num1);
        }else {
            System.out.println("Largest number " + num2);
        }
    }
}
