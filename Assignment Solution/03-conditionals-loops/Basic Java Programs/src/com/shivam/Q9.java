package com.shivam;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
//        Ques 9 --> Perimeter Of Equilateral Triangle
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side of triangle");
        float side=in.nextFloat();
        float perimeter=3*side;
        System.out.printf("%.2f",perimeter);
    }
}
