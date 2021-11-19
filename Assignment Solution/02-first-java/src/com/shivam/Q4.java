package com.shivam;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
//        Ques 4 -->  Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter number 1");
        num1=sc.nextInt();
        System.out.println("Enter number 2");
        num2=sc.nextInt();
        System.out.println("Enter operator");
        char op=sc.next().trim().charAt(0);
        if (op=='+'){
            System.out.println( num1 + num2);
        }else if (op=='-'){
            System.out.println(num1-num2);
        }else if (op=='*'){
            System.out.println(num1*num2);
        }else if (op=='/'){
            if (num2==0){
                System.out.println("Can not be divisible by 0");
            }else {
                System.out.println(num1/num2);
            }
        }else if (op=='%'){
            System.out.println(num1 % num2);

        }else {
            System.out.println("You enter a invalid operator");
        }
    }

}
