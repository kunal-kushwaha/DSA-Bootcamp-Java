//1. Write a program to print factorial of a number, also take input


import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact=1;
        for(int i = n; i >= 2; i--){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is "+fact);

    }
}
