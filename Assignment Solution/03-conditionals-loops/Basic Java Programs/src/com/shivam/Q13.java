package com.shivam;
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 13 --> Perimeter Of Rhombus
        float perimeter , a;
        System.out.println("Enter side of Rhombus");
        a=in.nextFloat();
        perimeter=4*a;
        System.out.printf("Perimeter %.2f",perimeter);
    }
}
