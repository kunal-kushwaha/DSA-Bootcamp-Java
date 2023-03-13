// 14.  *********
//       *     *
//        *   *
//         * *
//          *

public class Pattern14Assignment {
    public static void main(String[] args) {
        int n = 5;
        int countNum = 2 * n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < countNum; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == countNum - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            countNum -= 2;
            System.out.println();
        }
    }
}