import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int anotherNum = num;
        int rem;
        int sum = 0;

        while (num != 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum + (rem*rem*rem);
        }

        if (anotherNum == sum) {
            System.out.print("Armstrong Number");
        }
        else {
            System.out.print("Not Armstrong Number");
        }
    }
}
