package SolvedProblems.BitManipulation;

public class ResetBit {
    public static int reset(int n , int i){
        return ~(1 << i - 1) & n;
    }
    public static void main(String[] args) {
        int n = 45;
        int i = 4;
        System.out.println(reset(n, i));
    }
}
