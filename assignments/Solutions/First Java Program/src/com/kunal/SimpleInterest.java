package com.kunal;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please provide me the principal value, time(in years) and rate respectively.");
        int principal=input.nextInt();
        int rate=input.nextInt();
        int time=input.nextInt();
        int SI=(principal*rate*time)/100;
        System.out.println("Your interest = "+SI);

    }
}
