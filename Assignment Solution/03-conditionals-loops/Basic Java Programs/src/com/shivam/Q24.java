package com.shivam;
import java.util.Scanner;
public class Q24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 24 -->  Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        int num,sum=0;
        System.out.println("Enter number");

        while (true){
            num=in.nextInt();
            if (num==0){
                break;
            }else {
                sum+=num;
            }
        }
        System.out.println("Sum of numbers before non 0 element");
        System.out.println(sum);
    }
}
