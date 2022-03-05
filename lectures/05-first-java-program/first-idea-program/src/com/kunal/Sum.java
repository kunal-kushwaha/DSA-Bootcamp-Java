package com.kunal;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        float sum = num1 + num2;

        System.out.println("Sum = " + sum);
    }
}
