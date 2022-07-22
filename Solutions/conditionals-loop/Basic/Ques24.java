package com.harsh.Basic;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the sum of all numbers
public class Ques24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int sum = 0;
        while (n!=0){
            n = sc.nextInt();
            sum+=n;
        }
        System.out.println(sum);
    }
}
