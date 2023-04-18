package SolvedProblems.BitManipulation;

public class RightmostSetBit {
    public static int rightmostSetBit(int n){
        // int result = 0;
        // for(int i = 0; result == 0; result = 1 << ++i){
        //     result = result & n;
        // }
        return n & -n;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(rightmostSetBit(n));
    }
}
