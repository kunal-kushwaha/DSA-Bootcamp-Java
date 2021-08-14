/* 6. Take 2 numbers as input and print the largest number. */

import java.util.Scanner;

public class Greatest {
    public static void main(String args[]) {

        // Creating scanner object
        Scanner sc = new Scanner(System.in);
        int a, b;

        // Taking two numbers as input from user
        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();

        // Comparing a and b using if condition

        if (a > b)
            System.out.println(a + " is greater than " + b);
        else if (a < b)
            System.out.println(b + " is greater than " + a);
        else
            System.out.println("Both a and b are equals");
        sc.close();
    }
}
