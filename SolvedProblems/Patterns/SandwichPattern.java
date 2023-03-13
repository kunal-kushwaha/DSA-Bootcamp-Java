/*
   1   2   3   4   5
  11  12  13  14  15
  21  22  23  24  25
  16  17  18  19  20
   6   7   8   9  10
 */

public class SandwichPattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i += 2) {
            int val = (n * i) - (n - 1);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", val++);
            }
            System.out.println();
        }

        int i;
        if (n % 2 == 0) {
            i = n;
        } else {
            i = n - 1;
        }
        for (; i >= 1; i -= 2) {
            int val = (n * i) - (n - 1);
            if (i % 2 == 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%4d", val++);
                }
                System.out.println();
            }
        }
    }
}