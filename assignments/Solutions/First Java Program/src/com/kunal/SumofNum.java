package com.kunal;

import java.util.Scanner;

public class SumofNum {

    public static void main(String[] args) {

        System.out.println("Enter the numbers. Enter 0 to terminate");
        Scanner input=new Scanner(System.in);
        int sum=0;
        int n=1;
        while (n!=0){
            n=input.nextInt();
            sum+=n;
        }
        System.out.println("Sum of all numbers = " + sum );
    }
}
