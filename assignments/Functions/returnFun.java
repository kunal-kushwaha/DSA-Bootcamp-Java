package com.Functions;

import java.util.Scanner;

public class returnFun {
    public static void main(String[] args) {
       int ans = sum();
        System.out.print("you sum  : " +ans );
    }
    static  int sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter your number 1 :");
        int num1 = in.nextInt();
        System.out.print("enter your number 2 :");
        int num2 = in.nextInt();
        int sum = num1+num2;
     return sum;
    }
}
