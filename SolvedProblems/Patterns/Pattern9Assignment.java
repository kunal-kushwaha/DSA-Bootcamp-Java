package SolvedProblems.Patterns;

import java.util.Scanner;

public class Pattern9Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i + (i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
