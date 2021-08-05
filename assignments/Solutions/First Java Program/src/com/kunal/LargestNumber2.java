package com.kunal;

import java.util.Scanner;

public class LargestNumber2 {

    public static void main(String[] args) {

        System.out.println("Enter the numbers. Enter 0 to terminate");
        Scanner input=new Scanner(System.in);
        int large=0;
        int n=1;
        while (n!=0){
            n=input.nextInt();
            if(n > large)
                large = n;
        }
        System.out.println("Largest of all numbers = " + large );
    }
}
