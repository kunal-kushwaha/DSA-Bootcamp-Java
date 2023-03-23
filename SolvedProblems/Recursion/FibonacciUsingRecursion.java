package SolvedProblems.Recursion;

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

    public static void main(String[] args) {
        // Printing fibonacci from backwards
        int n = 10;

        // Printing fibonacci series
        System.out.println(0);
        System.out.println(1);
        fibonacciSeries(1, 0, n - 2);

        // Printing Nth fibonacci number
        System.out.println(fibonacci(n));
    }
}
/*
 * 0
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 21
 * 34
 * 55
 */