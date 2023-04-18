package SolvedProblems.BitManipulation;

public class XorOneToN {
    public static int xorRange(int a, int b) {
        return xorOneToN(b) - xorOneToN(a - 1);
    }

    public static int xorOneToN(int n) {
        // We found this pattern while writing the results
        return switch (n % 4) {
            case 0 -> n;
            case 1 -> 1;
            case 2 -> n + 1;
            case 3 -> 0;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        // 0^1^2^3^4^5^6^7^8.... upto n
        int n = 6;
        System.out.println(xorOneToN(n));

        // If we have given a range a to b
        int a = 8;
        int b = 12;
        System.out.println(xorRange(a , b));
        // System.out.println(8^9^10^11^12);
    }
}
