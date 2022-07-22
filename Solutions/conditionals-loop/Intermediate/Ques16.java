package Intermediate;

import java.util.Scanner;

// Reverse A String In Java
public class Ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder revstr = new StringBuilder(str);
        revstr.reverse();
        System.out.println(revstr.toString());
    }
}
