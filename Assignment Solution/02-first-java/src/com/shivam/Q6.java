package com.shivam;
import java.util.Scanner;
public class Q6 {
//    Ques 6 --> Input currency in rupees and output in USD.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        int inr_currency=sc.nextInt();
        float dollar=inr_currency/74.38f;
        System.out.println("Dollar " + dollar);
    }
}
