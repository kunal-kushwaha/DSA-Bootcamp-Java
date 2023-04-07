package SolvedProblems.Recursion;

import java.util.*;

public class FibonacciUsingRecursion {
    // Printing fibonacci series from 0 to N using recursion
    public static void fibonacciSeries(int previous, int secondPrevious, int n) {
        if (n == 0) {
            System.out.println(previous + secondPrevious);
            return;
        }

        System.out.println(previous + secondPrevious);

        fibonacciSeries(previous + secondPrevious, previous, n - 1);
    }

    // Printing the Nth fibonacci number using recursion
    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Printing the Nth fibonacci number with O(1) time complexity
    public static int fibWithConstantTime(int n) {
        // We can directly write the below because whatever after the subtraction give
        // us value less than 1 and that is also in some - 0.6... something so it will
        // only reduce the values after the decimal point but anyways we just need only
        // the values before the decimal point i.e. here we're typecasting it to int and
        // neglecting the values after decimal point
        // return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));

        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }

    public static void main(String[] args) {
        // Printing fibonacci from backwards
        int n = 10;

        // Printing fibonacci series
        System.out.println(0);
        System.out.println(1);
        fibonacciSeries(1, 0, n - 2);

        // Printing Nth fibonacci number
        System.out.println(fibonacci(n));

        System.out.println("O(1) : " + fibWithConstantTime(n));
    }
}