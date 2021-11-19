package com.shivam;
import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 23 --> Input a number and print all the factors of that number (use loops).
        System.out.println("Enter Number of which factor you want to know");
        int num=in.nextInt();
        System.out.println("Factors of " + num );
        for (int i = 1; i <= num; i++) {
            if (num%i==0){
                System.out.print(i + " ");
            }

        }
    }
}
