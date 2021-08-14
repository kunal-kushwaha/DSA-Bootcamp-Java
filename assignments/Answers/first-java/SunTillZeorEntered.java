
/* 9. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop) */
import java.util.Scanner;

public class SunTillZeorEntered {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers one by one and press 0 to terminate : ");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            sum = sum + num;
            num = sc.nextInt();
        }

        System.out.println("The sum of the entered numbers is " + sum);
        sc.close();
    }
}
