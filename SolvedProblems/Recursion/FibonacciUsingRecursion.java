package SolvedProblems.Recursion;

public class FibonacciUsingRecursion {
    // Printing fibonacci series from 0 to N using recursion
    public static void fibonacciSeries(int n_1, int n_2, int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n_1 + n_2);

        fibonacciSeries(n_1 + n_2, n_1, n - 1);
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

        System.out.println(0);
        System.out.println(1);
        fibonacciSeries(0, 1, n);

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
 */