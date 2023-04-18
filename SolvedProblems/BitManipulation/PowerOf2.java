package SolvedProblems.BitManipulation;

public class PowerOf2 {
    public static boolean powerOfTwo(int n) {
        return (n == 0) ? false : ((n & (n - 1)) == 0) ? true : false;
    }

    public static void main(String[] args) {
        // Check whether the number is power of two or not
        // Powers of two will have only one 1 in binary form so performing AND with the
        // previous numebr will give result 0. This means the no is power of two.
        // n = 8
        //      1 0 0 0   -> 8 
        //  &     1 1 1   -> 7
        //         0      -> 0 (power of two) 
        int n = 32;
        System.out.println(powerOfTwo(n));
    }
}
