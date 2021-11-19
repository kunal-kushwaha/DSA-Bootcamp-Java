package com.shivam;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 6 --> Area Of Rhombus
        float p,q,area;
        System.out.println("Enter p diagonal of Rhombus");
        p=in.nextFloat();
        System.out.println("Enter q diagonal on Rhombus");
        q=in.nextFloat();
        area=(p*q)/2;
        System.out.printf("%.2f",area);
    }
}
