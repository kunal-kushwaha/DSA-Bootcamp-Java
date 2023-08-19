import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter currency in Rupees: ");
        float rupees = input.nextFloat();

        float dollar = (float)(rupees / 82.08); // Exchange rate as of July 19th 2023

        System.out.print("Dollars = " + dollar);
    }
}

// To calculate Fibonacci Series up to n numbers.
// To find out whether the given String is Palindrome or not.
// To find Armstrong Number between two given number.
