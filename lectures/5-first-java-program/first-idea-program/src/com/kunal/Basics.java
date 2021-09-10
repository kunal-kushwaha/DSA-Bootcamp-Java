package com.kunal;

public class Basics {
    public static void main(String[] args) {
        int a = 10;
        if (a == 10) {
            // This block will run only if a is equal to 10
            System.out.println("Hello World");
        } else if (a == 20) {
            // This block will run only if a is equal to 20
            System.out.println("Hello World, a  is 20!");
        } else {
            // This block will run if and only if all the above if statements are false
            System.out.println("a is neither 20 not it's 10");
        }

        int count = 1;
        while (count != 5) {
            //This block will run in a loop, until count is not 5
            System.out.println(count);
            count++;
        }

        // for loop
        for (int count = 1; count != 5; count++) {
            System.out.println(count);
        }
    }
}
