package com.kunal;

/* Factorial of a number is the product of all the numbers from 1 to the number
     eg: factorial(5)=1*2*3*4*5=120*/

//NOTE:
/*Factorial of numbers greater than or equal to 13 cannot be found using primitive int data type due to overflow.
 These factorials are too large to fit in an int variable, whose maximum value is just 2147483647 (2^31 -1)
 For more info : https://javarevisited.blogspot.com/2015/08/how-to-calculate-large-factorials-using-BigInteger-Java-Example.html#axzz72c6PEmjz
 */



import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=input.nextInt();
        int factorial= 1;
        for (int i = 1; i <= n; i++) {
            factorial*=i;
        }
        System.out.println("Factorial of the number is : " + factorial);
    }
}
