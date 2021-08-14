/* 7. Input a number and print all the factors of that number (use loops). */

import java.util.Scanner;

public class Factors {
    public static void main(String args[]) {

        // Creating scanner object
        Scanner sc = new Scanner(System.in);
        int a;

        // Taking a numbers as input from user
        System.out.println("Enter a numbers : ");
        a = sc.nextInt();

        // Printing the factors of entered number using for loop
        System.out.println("Factors of " + a + " are :-");
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                System.out.println(i);
        }
        sc.close();
    }
}
