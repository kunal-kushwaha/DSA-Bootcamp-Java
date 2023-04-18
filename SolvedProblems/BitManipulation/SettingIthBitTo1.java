package SolvedProblems.BitManipulation;

public class SettingIthBitTo1 {
    public static int changeBit(int n, int i){
        return (1 << i - 1) | n;
    }
    public static void main(String[] args) {
        int n = 45;
        int i = 5;
        System.out.println(changeBit(n, i));
    }
}
