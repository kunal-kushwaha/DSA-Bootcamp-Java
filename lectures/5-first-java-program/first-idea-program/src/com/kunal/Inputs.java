package com.kunal;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        // Setting input as standard input
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter some input: ");
        // To input a integer
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);
        // To input float
        float marks = input.nextFloat();
        System.out.println(marks);
        // To input a string (will break if space is found)
        String name = input.next();
        System.out.println(name);
        // To enter a space seprated string without breaking
        String address = input.nextLine();
        System.out.println(address);
    }
}