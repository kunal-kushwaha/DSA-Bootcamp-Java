package Intermediate;

import java.util.Scanner;

// Factorial Program In Java
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial*=i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
