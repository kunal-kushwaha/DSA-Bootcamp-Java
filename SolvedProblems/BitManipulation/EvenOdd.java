package SolvedProblems.BitManipulation;

public class EvenOdd {
    public static boolean evenOdd(int n) {
        return (n & 1) == 0;
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(evenOdd(n)? "Even": "Odd");
    }
}
