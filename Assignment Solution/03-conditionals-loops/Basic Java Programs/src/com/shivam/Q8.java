package com.shivam;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
//    Ques 8 -->  Perimeter Of Circle
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float radius=in.nextFloat();
        float pi= (float) Math.PI;
        float perimeter=2*pi*radius;
        System.out.printf("%.2f",perimeter);

    }
}
