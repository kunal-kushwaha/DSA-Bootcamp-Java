package Intermediate;

import java.util.Scanner;

// Java Program Vowel Or Consonant
public class Ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char y = Character.toLowerCase(sc.next().charAt(0));
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u') System.out.println("It is a Vowel.");
        else System.out.println("It is a Consonant.");
    }
}
