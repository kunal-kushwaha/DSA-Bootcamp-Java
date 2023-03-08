public class Pattern32Assignment {
    public static void main(String[] args) {
        char n = 5;
        n += 64;

        for (int i = 0; i < n - 64; i++) {
            
            for (int j = 0; j <= i; j++) {
                char val = (char) (n - i + j);
                System.out.print(val);
            }
            System.out.println();
        }
    }
}

// 5
// 4 5
// 3 4 5
// 2 3 4 5
// 1 2 3 4 5