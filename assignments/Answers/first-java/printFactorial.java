/* 1 . Write a program to print factorial of a number, also take input.*/

import java.util.Scanner;

public class printFactorial {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt(); // integer reference variable to store the entered number by user
        long fact = 1; // variable to store the factorial of the entered number
        for (int i = 1; i <= num; i++)
            fact = fact * i;

        System.out.println("The factorial of " + num + " is : " + fact); // printing the factorial
        in.close();

    }
}
