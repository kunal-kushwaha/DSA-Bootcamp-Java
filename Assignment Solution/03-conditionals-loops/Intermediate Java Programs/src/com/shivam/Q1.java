package com.shivam;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 1 --> Factorial Program In Java
        System.out.println("Enter Number of which factorial you want");
        int fnum=in.nextInt();
        int fval=1;
//        int i=fnum;
        while (fnum >= 1) {
            fval*=fnum;
            fnum--;
        }
        System.out.println("Factorial : " +fval);


    }
}
