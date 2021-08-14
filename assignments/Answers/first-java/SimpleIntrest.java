
/* 4 . Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest. */
import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double P, R, T;
        System.out.println("Enter Principle , Rate , and time : ");

        // Taking principle, rate, and time as input

        P = in.nextDouble();
        R = in.nextDouble();
        T = in.nextDouble();

        // Intrest calculation

        double I = P * R * T * 0.01;
        System.out.println("Intrest is = " + I);
        in.close();
    }

}
