package SolvedProblems.Recursion;

public class FirstUpperCase {
    public static char firstUpperCase(String str, int i) {
        if (i >= str.length()) {
            return 'a';
        }
        
        if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
            return str.charAt(i);
        }

        return firstUpperCase(str, i + 1);
    }

    public static void main(String[] args) {
        String str = "programming";
        System.out.println(firstUpperCase(str, 0));
    }
}
