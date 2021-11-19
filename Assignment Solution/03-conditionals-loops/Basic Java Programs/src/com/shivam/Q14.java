package com.shivam;
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 14 -->  Volume Of Cone Java Program
        float r,h;
        float pi= (float) Math.PI;
        float Volume;
        System.out.println("Enter radius of cone");
        r=in.nextFloat();
        System.out.println("Enter height of cone ");
        h=in.nextFloat();
        Volume=pi*(r*r)*(h/3);
        System.out.printf("Volume of cone : %.2f",Volume);
    }
}
