package SolvedProblems.Patterns;

public class Pattern30Assignment {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            int val = i;
            for (int j = 1; j <= count; j++) {
                if (j < (count / 2) + 1)
                    System.out.printf("%2d", val--);
                else
                    System.out.printf("%2d", val++);
            }
            count += 2;
            System.out.println();
        }
    }
}
