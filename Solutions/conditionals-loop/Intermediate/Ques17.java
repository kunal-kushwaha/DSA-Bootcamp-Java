package Intermediate;

import java.util.Scanner;

// Find if a number is palindrome or not
public class Ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int revN = 0, remainder;
        // store the number to originalNum
        int originalNum = n;

        // get the reverse of originalNum store it in variable
        while (n != 0) {
            remainder = n % 10;
            revN = revN * 10 + remainder;
            n /= 10;
        }

        System.out.println(originalNum == revN);
    }
}
