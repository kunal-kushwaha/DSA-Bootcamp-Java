import java.util.Scanner;

class FindingHcfLcm{
    public static void main(String[] args) {
        System.out.println("Please enter two numbers to find there LCM and HCF:");
        Scanner readInput = new Scanner(System.in);
        int num1 = readInput.nextInt();
        int num2 = readInput.nextInt();
        readInput.close();
        int dividend, divisor, reminder, hcf, lcm;

        if (num1 > num2) {
            dividend = num1;
            divisor = num2;
        } else {
            dividend = num2;
            divisor = num1;
        }

        reminder = dividend%divisor;

        while (reminder > 0) {
            dividend = divisor;
            divisor = reminder;
            reminder = dividend%divisor;
        }

        hcf = divisor;
        lcm = (num1 * num2)/hcf;

        System.out.println("HCF : " + hcf);
        System.out.println("LCM : " + lcm);

    }
}