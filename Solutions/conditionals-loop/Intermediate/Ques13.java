package Intermediate;

import java.util.Scanner;

// Sum Of N Numbers
public class Ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.printf("Sum: %d", sum);
    }
}
