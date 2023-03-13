public class Pattern24Assignment {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j == 0 || j == 2 * n - 1 || j == i || j == (2 * n) - i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
