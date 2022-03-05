package com.kunal.intro;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print(1);
    }

    static void print(int n) {
        // base condition
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack

        // this is called tail recursion
        // this is the last function call
        print(n + 1);
    }
}
