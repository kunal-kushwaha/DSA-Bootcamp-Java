package com.shivam;
import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 18 -->  Volume Of Pyramid
        float volume,length,width,height;
        System.out.println("Enter Length");
        length=in.nextFloat();
        System.out.println("Enter Width");
        width=in.nextFloat();
        System.out.println("Enter Height");
        height=in.nextFloat();
        volume=(length*width*height)/3;
        System.out.printf("Volume Of Pyramid : %.2f",volume);

    }
}
