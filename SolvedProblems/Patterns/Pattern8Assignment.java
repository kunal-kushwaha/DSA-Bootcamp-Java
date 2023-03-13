import java.util.*;

public class Pattern8Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            num += 2;
            System.out.println();
        }
    }
}