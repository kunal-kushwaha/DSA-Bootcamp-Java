package SolvedProblems.Recursion;

import java.util.Arrays;

public class ReverseString {
    public static char[] swapChar(char[] s, int start, int end) {
        if (start > end) {
            return s;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        return swapChar(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println(Arrays.toString(swapChar(s, 0, s.length - 1)));
    }
}
