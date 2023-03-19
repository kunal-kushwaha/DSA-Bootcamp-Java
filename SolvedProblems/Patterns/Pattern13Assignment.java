/*
 * Problem
 * 
 * 13.   *
 *      * *
 *     *   *
 *    *     *
 *   *********
 */
package SolvedProblems.Patterns;

public class Pattern13Assignment {
    public static void main(String[] args) {
        int n = 5;

        int countNum = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < countNum; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == countNum - 1) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            countNum += 2;
        }
    }
}
