package com.harsh;

import java.util.Scanner;

// To find Armstrong Number between two given number.
/*
    Note that there is no two-digit Armstrong number and 1 is an armstrong number
 */

public class Ques9 {

    static boolean isArmstrong(int num){
        int originalNumber = num;
        int remainder;
        int result = 0;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        return result == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        for (int i = num1; i < num2; i++) {
            if (isArmstrong(i)) System.out.println(i);
        }

    }
}
