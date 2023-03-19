package SolvedProblems.Patterns;

import java.util.Scanner;

public class Pattern12Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        sc.close();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}