package Intermediate;

import java.util.Scanner;

// Armstrong Number In Java
public class Ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int copy = n;
        int result = 0;
        while (copy != 0){
            int digit = copy%10;  // extracting the last digit of the number
            result +=Math.pow(digit, 3);
            copy/=10;
        }

        System.out.println(result == n);
    }
}
