//4. Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        System.out.print("Enter Principle,time and rate : ");
        Scanner in = new Scanner(System.in);
        float P = in.nextFloat();
        float T = in.nextFloat();
        float R = in.nextFloat();
        double SI = (P*T*R)/100;
        System.out.println("Simple Interest = "+SI);

    }
}
