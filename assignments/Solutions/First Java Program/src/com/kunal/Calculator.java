package com.kunal;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers.");
        double n1=input.nextDouble();
        double n2=input.nextDouble();
        System.out.println("Which among the following operation you want to perform?");
        System.out.println("+ , - , / , *");
        //for character input in scanner we don't have such thing as input.nextChar() .
        //therefore this is how you take a character input
        //charAt() is a function which gives us the character at a specified index in a string
        char operator=(input.next()).charAt(0);
        double ans;

        if (operator == '+')
            ans = n1 + n2;
        else if (operator == '-')
            ans = n1 - n2;
        else if (operator == '*')
            ans = n1 * n2;
        else if (operator == '/')
            ans = n1 / n2;
        else {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Answer = " + ans);

    }
}

