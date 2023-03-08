public class Pattern16Assignment {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i
            ; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) 
            {
                if (j == 0 || i == 0) {
                    count = 1;
                } else {
                    count = count * (i - j + 1) / j;
                }
                System.out.printf("%4d", count);
            }

            System.out.println();
        }

    }
}
