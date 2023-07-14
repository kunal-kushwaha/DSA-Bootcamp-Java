import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        System.out.print("Enter the principal amount, Time period and Rate of Interest separated by space: ");
        Scanner input = new Scanner(System.in);
        double principal = input.nextDouble();
        double time = input.nextDouble();
        double interest = input.nextDouble();

        double si = principal * time * interest / 100;
        System.out.println("The si is: " + si);

        input.close();
    }
}
