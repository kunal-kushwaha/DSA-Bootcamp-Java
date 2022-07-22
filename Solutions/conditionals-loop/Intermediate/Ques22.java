package Intermediate;

import java.util.Scanner;

// Perfect Number In Java
public class Ques22 {
    public static void main(String[] args) {
//        A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number
//        Time Complexity: O(√n)
//       Auxiliary Space: O(1)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :: ");
        int num = sc.nextInt();
        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i==0) {
                if(i * i != num) sum = sum + i + num / i;
                else sum = sum + i;
            }
        }

        System.out.println(sum == num);
    }
}
