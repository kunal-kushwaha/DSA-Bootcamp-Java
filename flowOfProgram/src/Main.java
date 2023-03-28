import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       1, Input a year and find whether it is a leap year or not.
        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n % 4 == 0) {
            System.out.println(n + " is a leap Year.");
        }else {
            System.out.println(n + " is not a leap year.");
        }

         */

//       2, Take two numbers and print the sum of both.
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number : ");
        int n1 = in.nextInt();
        System.out.println("enter second number : ");
        int n2 = in.nextInt();

        int sum = n1 + n2;

        System.out.println("the sum of " + n1 + " and " + n2 + " is : " + sum);

         */

//       3, Take a number as input and print the multiplication table for it.
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to see the table of this number:");
        int n1 = in.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(n1 + " * " + i + " = " + i*n1);
        }

         */

//       4, Take 2 numbers as inputs and find their HCF and LCM.
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number : ");
        int n1 = in.nextInt();
        System.out.println("enter second number : ");
        int n2 = in.nextInt();

        int hcf = 0;

        for (int i = 1; i <= n1; i++) {
            if(n1 % i == 0 && n2 % i == 0){
                hcf = i;
            }
        }
        int lcm = (n1*n2)/hcf;

        System.out.println(hcf + " is HCF and " + lcm + " is LCM");

         */

//       5, Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to add! Or press any key to see the sum and exit :");
        int sum = 0;

        while (in.hasNextInt()) {
            System.out.println("Enter a number to add! Or press any key to see the sum and exit :");
            int n = in.nextInt();
            sum += n;

        }

        System.out.println("The sum of all Those numbers are : " + sum);

         */

    }
}