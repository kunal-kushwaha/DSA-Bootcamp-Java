package com.kunal;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner in  = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }


    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}
