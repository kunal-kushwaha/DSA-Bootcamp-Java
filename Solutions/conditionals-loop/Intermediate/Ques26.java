package Intermediate;

import java.util.Scanner;

// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N)
// entered by the user. The list terminates when the user enters a zero.
public class Ques26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int negativeSum = 0, positiveEvenSum = 0, positiveOddSum = 0;
        System.out.println("Enter Numbers:");
        while (true) {
            int n = in.nextInt();
            if (n == 0) break;

            if (n < 0) negativeSum += n;
            else if (n % 2 == 0) positiveEvenSum += n;
            else positiveOddSum += n;
        }

        System.out.println("Negative No. Sum = " + negativeSum);
        System.out.println("Positive Even No. Sum = " + positiveEvenSum);
        System.out.println("Positive Odd No. Sum = " + positiveOddSum);
    }
}
