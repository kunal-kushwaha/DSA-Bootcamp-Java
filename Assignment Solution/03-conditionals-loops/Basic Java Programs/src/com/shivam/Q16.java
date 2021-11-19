package com.shivam;
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        Ques 16 -->  Volume Of Cylinder
        float radius,height;
        float pi = (float) Math.PI;
        float volume;
        System.out.println("Enter radius of Cylinder");
        radius=in.nextFloat();
        System.out.println("Enter height of Cylinder");
        height=in.nextFloat();
        volume=pi*(radius*radius)*height;
        System.out.printf("volme of Cylinder : %.2f",volume);
    }
}
