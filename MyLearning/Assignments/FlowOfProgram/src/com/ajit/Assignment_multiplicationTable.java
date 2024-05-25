package com.ajit;

import java.util.Scanner;

public class Assignment_multiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=input.nextInt();
        for(int i=1;i<=12;i++){
            int result=i*num;
            System.out.println(num+" * "+i+" = "+result);
        }
        input.close();
    }
}
