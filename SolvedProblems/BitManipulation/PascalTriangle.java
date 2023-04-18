package SolvedProblems.BitManipulation;

public class PascalTriangle {
    public static int nthSum(int n) {
        return (n == 1) ? 1 : 1 << n;
    }

    public static void main(String[] args) {
        // Find the sum of Nth row in pascal's triangle
        // 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
        // 1 5 10 10 5 1
        int n = 5;
        // Expected result is 32
        System.out.println(nthSum(n));

    }
}