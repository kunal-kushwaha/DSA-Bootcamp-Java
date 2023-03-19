package SolvedProblems.Patterns;

public class Pattern21Assignment {
    public static void main(String[] args) {
        int n = 5;

        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("% 2d ", num++);
            }
            System.out.println();
        }
    }
}
