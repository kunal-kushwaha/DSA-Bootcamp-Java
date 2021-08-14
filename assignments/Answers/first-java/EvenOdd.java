/* 2. Write a program to print whether a number is even or odd, also take input.*/

import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in); // Creating the object of the Scanner class
        System.out.println("Enter the number to check for ever or odd");
        int num = in.nextInt(); // Taking a number as input from user
        if (num % 2 == 0) // check whether number is divisible by 2 or not
            System.out.println(num + " is an even number.");
        else
            System.out.println(num + " is an odd number.");
        in.close();
    }
}
