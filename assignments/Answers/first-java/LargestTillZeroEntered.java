
/* 10. Take integer inputs till the user enters 0 and print the largest number from all. */
import java.util.Scanner;

public class LargestTillZeroEntered {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers and press 0 to terminate the program : ");

        // integer variable to store the numbers entered by user.
        int num = sc.nextInt();

        // Integer variable to store the greatest of all the numbers entered by user.
        int greatest = num;

        while (num != 0) { // taking input till 0 is entered
            if (greatest < num)
                greatest = num;
            num = sc.nextInt();
        }
        System.out.println("The greatest of all the numbers entered is : " + greatest);
        sc.close();
    }
}
