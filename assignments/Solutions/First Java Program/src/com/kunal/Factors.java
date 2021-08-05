package com.kunal;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=input.nextInt();
        System.out.print("Factors are : 1 ");
        int c=2;
        while(c*c<=n) {
            if(n%c==0)
                System.out.print(c + " ");
            c++;
        }
        if(n%c==0)             //so that the last factor is not left out eg: n=20;
            System.out.println(c);
    }
}
