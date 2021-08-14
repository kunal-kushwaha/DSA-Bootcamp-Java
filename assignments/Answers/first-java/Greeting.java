/* 3 . Take name as input and print a greeting message for that name. */

import java.util.Scanner;

public class Greeting {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.println("Hello👋 " + in.nextLine() + "!, Nice to have you here."); // Taking name as input inside the
                                                                                      // print statement.
        in.close();
    }
}
