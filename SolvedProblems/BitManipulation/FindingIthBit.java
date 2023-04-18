package SolvedProblems.BitManipulation;

public class FindingIthBit {
    public static int iThBit(int n, int i){
        return (1 << i - 1) & n;
    }
    public static void main(String[] args) {
        int n = 45;
        int i = 4;
        // Explanation
        // Let's say I have a binary number and I have to return the ith bit
        // My no is 45 and it's binary form is
        // 1 0 1 1 0 1
        // 6 5 4 3 2 1 is the i positions
        // return the ith position of the numeber 
        // if my i is 4 my ans is 8. 
        System.out.println(iThBit(n, i));
    }
}
