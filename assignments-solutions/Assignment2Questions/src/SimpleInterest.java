import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        int P = input.nextInt();

        System.out.print("Enter Rate of Interest: ");
        int R = input.nextInt();

        System.out.print("Enter Time Period: ");
        int T = input.nextInt();

        float SI = (P * R * T)/100;

        System.out.print("Simple Interest is: " + SI);
    }
}
