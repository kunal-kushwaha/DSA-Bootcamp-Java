public class Pattern31Assignment {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (i == 0 || i == 2 * n - 2 || j == 0 || j == 2 * n - 2) {
                    System.out.print(n);
                } else {
                    System.out.print(n - i);
                }
            }
            System.out.println();
        }
    }
}
