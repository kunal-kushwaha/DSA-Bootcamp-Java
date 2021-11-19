package com.shivam;
import  java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 17 -->  Volume Of Sphere
        float radius,volume;
        float pi =(float) Math.PI;
        System.out.println("Enter radius of sphere");
        radius = in.nextFloat();
        volume=4/3.0f*pi*(radius*radius*radius);
        System.out.printf("volume of Sphere %.2f", volume);
    }
}
