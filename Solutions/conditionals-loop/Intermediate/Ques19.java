package Intermediate;

import java.util.Scanner;

// HCF Of Two Numbers Program
public class Ques19 {
    public static void main(String[] args) {
        /*
        HCF = the highest common factor between 2 numbers
        eg:  12 → 1, 2, 3, 4, 6, 12
             16 → 1, 2, 4, 8, 16
             The common factors are 1, 2, 4 and the highest common factor(HCF) is 4.
         */

        int a, b, i, hcf = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :: ");
        a = sc.nextInt();
        System.out.println("Enter second number :: ");
        b = sc.nextInt();

        for(i = 1; i <= a || i <= b; i++) {
            if( a%i == 0 && b%i == 0 )
                hcf = i;
        }
        System.out.println("HCF of given two numbers is :"+hcf);
    }
}
