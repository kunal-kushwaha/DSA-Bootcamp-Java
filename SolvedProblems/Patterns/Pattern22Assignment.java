package SolvedProblems.Patterns;

public class Pattern22Assignment {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (count % 2 == 0)
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
                count++;
            }
            System.out.println();
        }
    }
}
