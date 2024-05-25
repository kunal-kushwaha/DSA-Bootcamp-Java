package com.ajit;

import java.util.Scanner;

public class Assignment_sumOfNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number1:");
        Float num1=input.nextFloat();
        System.out.println("Please enter number2:");
        Float num2=input.nextFloat();
        Float result=num1+num2;
        System.out.println("Total:"+result);
        input.close();

    }
    
}
