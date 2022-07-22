package Intermediate;

import java.util.Scanner;

// Sum Of A Digits Of Number
public class Ques24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0){
            int d = n%10;
            sum+=d;
            n/=10;
        }
        System.out.println(sum);
    }
}
