package com.shivam;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 5 -->  Area Of Parallelogram

        float base,height,area;
        System.out.println("Enter base of parallelogram");
        base=in.nextFloat();
        System.out.println("Enter height of parallelogram");
        height=in.nextFloat();
        area=base*height;
        System.out.printf("%.2f",area);
    }
}
