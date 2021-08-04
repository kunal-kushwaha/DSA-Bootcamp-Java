//3. Take name as input and print a greeting message for that name.

import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello "+name+"!!! I hope you are doing good... Keep rocking and keep smiling :):)");
    }
}
