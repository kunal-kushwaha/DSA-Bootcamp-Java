package SolvedProblems.BitManipulation;

public class NoOfSetBits {
    public static int setBits(int n){
        int count = 0;

        while(n > 0){
            n = n - (n & (-n));
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        // Find number of bits in the given N is 1;
        int n = 234567 ;
        System.out.println(Integer.toBinaryString(n) + " : " + setBits(n));
    }
}
