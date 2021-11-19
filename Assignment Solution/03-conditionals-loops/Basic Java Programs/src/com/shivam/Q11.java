package com.shivam;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 11 -->  Perimeter Of Rectangle

        float perimeter,length,width;
        System.out.println("Enter Length of Rectangle");
        length=in.nextFloat();
        System.out.println("Enter Width of Rectangle");
        width=in.nextFloat();
        perimeter=2*(length+width);
        System.out.printf("Perimeter : %.2f" , perimeter);

    }

}
