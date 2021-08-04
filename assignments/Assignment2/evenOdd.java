//2. Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n % 2 == 0){
            System.out.print(n+" is Even");
        }
        else{
            System.out.print(n+" is Odd");
        }
    }
}
