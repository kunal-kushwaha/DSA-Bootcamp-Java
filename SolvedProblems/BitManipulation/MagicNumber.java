package SolvedProblems.BitManipulation;

public class MagicNumber {
    public static int magic(int n) {
        int result = 0;
        // Length of the number N in binary
        System.out.println((int) (Math.log(n) / Math.log(2)) + 1);
        
        for (int i = 5; n > 0; n >>= 1, i *= 5) {
            int last = n & 1;
            result = result + last * i;
        }

        return result;
    }

    public static void main(String[] args) {
        // Magic number problem: we have to add the powers of 5 in every ith bit of a
        // number
        // 1 = 0 0 1 = 5
        // 2 = 0 1 0 = 25
        // 3 = 0 1 1 = 30
        // 4 = 1 0 0 = 125
        // 5 = 1 0 1 = 130
        int n = 5;
        System.out.println(magic(n));
    }
}
