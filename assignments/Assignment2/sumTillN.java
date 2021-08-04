//9. Take integer inputs till the user enters 0 and print the sum of all numbers(HINT: while loop)

import java.util.Scanner;

public class sumTillN {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = n;
        while(n!=0){
            System.out.print("Enter number : ");
            n = in.nextInt();
            sum = sum + n;
        }
        System.out.println("sum  = "+sum);
    }
}
