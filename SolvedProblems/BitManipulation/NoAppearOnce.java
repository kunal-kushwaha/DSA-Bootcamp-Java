package SolvedProblems.BitManipulation;

public class NoAppearOnce {
    public static int numberAppearingOnce(int[] arr, int n) {
        int num = 0;
        

        return num;
    }

    public static void main(String[] args) {
        // The question is, let's say we have a array of number appearing N times. One
        // number is appearing only once, we have to find that number. We can just XOR
        // all the values in the array if we have numbers appearing even times we have
        // solved it in previous problem FindingIthBit.java
        // The given array is below
        // Here 7 appears 1 time and other numbers appears N times
        int[] arr = { 2, 4, 5, 2, 4, 5, 2, 4, 7, 5 };
        int n = 3;

        System.out.println(numberAppearingOnce(arr, n));
    }
}
