import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter operator: ");
        char op = input.next().charAt(0);

//        int ans = 0;

        if (op == '+') {
            System.out.print("Answer = " + (num1 + num2));
        }
        else if (op == '-') {
            System.out.print("Answer = " + (num1 - num2));
        }
        else if (op == '*') {
            System.out.print("Answer = " + (num1 * num2));
        }
        else if (op == '/') {
            if (num2 != 0) {
                System.out.print("Answer = " + (num2 / num1));
            }
        }
        else {
            System.out.print("Invalid Operation!");
        }
    }
}
