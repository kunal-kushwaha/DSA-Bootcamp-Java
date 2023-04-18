package SolvedProblems.BitManipulation;

public class UniqueNoInArray {
    public static int uniqueNo(int[] arr) {
        int XOR = 0;
        for (int i : arr) {
            XOR = XOR ^ i;
        }
        return XOR;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 2, 1, 3, 6, 4 };
        System.out.println(uniqueNo(arr));
    }
}
