package com.shivam;
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 12 --> Perimeter Of Square
        System.out.println("Enter side of square");
        float a= in.nextFloat();
        float perimeter=4*a;
        System.out.printf("Perimeter %.2f",perimeter);
    }
}
