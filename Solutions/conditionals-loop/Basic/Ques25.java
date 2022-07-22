package com.harsh.Basic;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the largest number from all.
public class Ques25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int max = 0;
        while (n!=0){
            n = sc.nextInt();
            if (max<n) max = n;
        }
        System.out.println(max);
    }
}
