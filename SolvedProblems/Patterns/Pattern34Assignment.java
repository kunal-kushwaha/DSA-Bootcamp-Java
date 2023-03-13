public class Pattern34Assignment {
    public static void main(String[] args) {
        char n = 5;
        int count = n;
        n += 64;

        for (int i = 1; i <= n - 64; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print((char) (count - j + 1 + 64));
            }
            System.out.println();
            count--;
        }
    }
}
