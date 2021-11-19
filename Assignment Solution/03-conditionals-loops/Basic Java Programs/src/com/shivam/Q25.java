package com.shivam;
import java.util.Scanner;
public class Q25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 25 --> Take integer inputs till the user enters 0 and print the largest number from all.
        int num,largest=0;
        System.out.println("Enter Number");
        while (true){
            num=in.nextInt();
            if (num==0){
                break;
            }
            else if (num>largest){
                largest=num;

            }
        }
        System.out.println("Largest Integer input :  " + largest);


    }
}
