package com.shivam;
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 19 -->  Curved Surface Area Of Cylinder
        float csa,r,h;
        float pi=(float) Math.PI;
        System.out.println("Enter radius");
        r=in.nextFloat();
        System.out.println("Enter height");
        h=in.nextFloat();
        csa=2*pi*r*h;
        System.out.println("Curved Surface Area Of Cylinder");
        System.out.printf("%.2f",csa);
    }
}
