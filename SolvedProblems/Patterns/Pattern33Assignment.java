public class Pattern33Assignment {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (a % 2 == 1) {
                    System.out.print((char) (64 + 32 + a) + " ");
                    a++;
                } else {
                    System.out.print((char) (64 + a) + " ");
                    a++;
                }
            }
            System.out.println();
        }
    }
}