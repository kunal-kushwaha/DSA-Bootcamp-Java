// 15.      *
//         * *
//        *   *
//       *     *
//      *       *
//       *     *
//        *   *
//         * *
//          *

public class Pattern15Assignment {
    public static void main(String[] args) {
        int n = 5;
        int countNum = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < countNum; j++) {
                if (j == 0 || j == countNum - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            countNum += 2;
            System.out.println();

        }
        n--;
        countNum = 2 * n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < countNum; j++) {
                if (j == 0 || j == countNum - 1) {
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
