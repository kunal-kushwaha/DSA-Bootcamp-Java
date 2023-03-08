/*
19.    *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *
 */

public class Pattern19Assignment {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * (n - i) - 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * i + 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
