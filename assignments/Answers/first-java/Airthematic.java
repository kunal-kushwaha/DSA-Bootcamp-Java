
/* 5. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions) */
import java.util.Scanner;

public class Airthematic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");

        // taking two numbers and operator as input from user

        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        System.out.println("Enter any operator from these (+, -, *, /) to perform operation on numbers : ");
        char operater = sc.next().charAt(0);

        // Performing airthematic operations on the entered numbers using if conditions

        double oper = 0;
        if (operater == '+')
            oper = num1 + num2;
        if (operater == '-')
            oper = num1 - num2;
        if (operater == '*')
            oper = num1 * num2;
        if (operater == '/')
            oper = num1 / num2;
        System.out.println("The result of the airthematic operation is : " + oper);
        sc.close();
    }
}
