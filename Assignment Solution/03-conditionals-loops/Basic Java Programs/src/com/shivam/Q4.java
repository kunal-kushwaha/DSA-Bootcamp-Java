package com.shivam;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 4 -->  Area Of Isosceles Triangle
        float base,height,area;
        System.out.println("Enter base of Isosceles triangle ");
        base=in.nextFloat();
        System.out.println("Enter height of Isosceles triangle ");
        height=in.nextFloat();
        area=0.5f*base*height;
        System.out.printf("%.2f", area);
    }
}
