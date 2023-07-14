import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        System.out.println("Enter two num: ");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("Enter the operation(+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result = 0;

        if(operator == '+'){
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0){
                result = num1 / num2;
            }
            else {
                System.out.println("Dividing a number by zero is not allowed");
            }

        }else {
            System.out.println("Error: Invalid operator");
        }

        System.out.println("Result: " + result);

        input.close();
    }
}
