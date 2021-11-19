package com.shivam;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 7 --> Area Of Equilateral Triangle
        float area,a;
        System.out.println("Enter side of equilateral triangle");
        a=in.nextFloat();
        float sqr= (float) Math.sqrt(3);
        area=sqr/4*(a*a);
        System.out.printf("%.2f",area);
    }
}
