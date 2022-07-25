package com.Functions;

import java.util.Scanner;

public class passingByValue {
    public static void main(String[] args) {
//        swap
        Scanner  in = new Scanner(System.in);
//        int a= in.nextInt();
//        int b = in.nextInt();
        int a = 10;
        int b = 20;
       swap(a,b);
       System.out.print(a + " " + b );

    }
    static void swap(int a , int b)
    {
        int temp = a;
        a =b;
        b= temp;
    }
}
