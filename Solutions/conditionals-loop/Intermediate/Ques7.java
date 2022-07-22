package Intermediate;

import java.util.Scanner;

// Power In Java
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value: ");
        float base = sc.nextFloat();
        System.out.println("Enter the power: ");
        float power = sc.nextFloat();

        System.out.println("Power: " + (Math.pow(base, power)));
    }
}
