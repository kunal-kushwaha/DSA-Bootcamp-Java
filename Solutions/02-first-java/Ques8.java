package com.harsh;
//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {  // program is case-sensitive to make it insensitive use equalsIgnoreCase() in line 12
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sbr = new StringBuilder(str);
        sbr.reverse();
        System.out.println(sbr.toString().equals(str));
    }
}
