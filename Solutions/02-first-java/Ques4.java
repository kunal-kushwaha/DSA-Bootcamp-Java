package com.harsh;

import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the operator: ");
        String oper = sc.next();
        System.out.println("Enter the second number: ");
        float num2 = sc.nextFloat();

        if (oper.equals("+")) System.out.println(num1+num2);
        else if (oper.equals("-")) System.out.println(num1-num2);
        else if (oper.equals("x")) System.out.println(num1*num2);
        else if (oper.equals("/")) System.out.println(num1/num2);
    }
}
