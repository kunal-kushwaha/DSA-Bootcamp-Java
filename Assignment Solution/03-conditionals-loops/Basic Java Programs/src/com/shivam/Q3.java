package com.shivam;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
//        Ques 3 -->  Area Of Rectangle Program
        Scanner in =new Scanner(System.in);
        float width,length,area;
        System.out.println("Enter Width of rectangle");
        width=in.nextFloat();
        System.out.println("Enter length of rectangle");
        length=in.nextFloat();
        area=width*length;
        System.out.printf("%.2f",area);

    }
}
