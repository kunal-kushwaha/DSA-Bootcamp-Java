/*
27.   1  2  3  4  5  26 27 28 29 30
         6  7  8  9  22 23 24 25
            10 11 12 19 20 21
               13 14 17 18
                  15 16
 */

public class Pattern27Assignment {
    public static void main(String[] args) {
        int n = 5;
        int frontVal = 1;
        int backVal = n * n + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("    ");
            }

            for (int j = 0; j < n-i; j++) {
                System.out.printf("%4d", frontVal++);
            }

            for (int j = 0; j < n - i; j++) {
                System.out.printf("%4d", backVal++);
            }
            backVal = backVal - ((2 * (n-i) )-1);
            System.out.println();
        }
    }
}
