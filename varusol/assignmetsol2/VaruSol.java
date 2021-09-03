

package com.varun;

import java.util.Scanner;

public class VaruSol {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter temp in C :");
//        float tempC = input.nextFloat();
//        float tempF = (tempC * 9/5) + 32;
//        System.out.println("Temp in F is : " + tempF);
//
//__________________________________________________________________________________________________________________________________________

//        Write a program to print whether a number is even or odd, also take input.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter num to check if its prime or not : ");
//        int num = input.nextInt();
//        if (num % 2 == 0){
//            System.out.println(num + " is even");
//
//        }
//        if (num % 2 != 0  ){
//            System.out.println(num + " is odd");
//        }
// __________________________________________________________________________________________________________________________________________


//     q 2   Take name as input and print a greeting message for that name.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your name : ");
//        String name  = input.nextLine();
//        System.out.println("How are you " + name );

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter P R T  to Cal SI : ");
//        int p = input.nextInt();
//        int r = input.nextInt();
//        int t = input.nextInt();
//        int si = (p*r*t) / 2;
//        System.out.println("Si is : " + si);

// __________________________________________________________________________________________________________________________________________

//    Question     Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter num1 ");
//            int num1 = input.nextInt();
//            System.out.println("Enter num2 ");
//            int num2 = input.nextInt();
//            System.out.println("Enter your operation + - * / :");
//            String op = input.next();
//            if (op  == "+"){
//
//                System.out.println(num1+num2);
//            }
//            if (op  == "-"){
//                System.out.println(num1-num2);
//            }
//            if (op  == "*"){
//                System.out.println(num1*num2);
//            }
//            if (op  == "/"){
//                System.out.println(num1/num2);
//            }
//            System.out.println("Invalid Operator : TRy Again");
//not working as expected !


// __________________________________________________________________________________________________________________________________________

//      Question   Take 2 numbers as input and print the largest number.
//       Approach
//         num1 = 5
//         num2 = 6
//         check 5 < 6 or 5 > 6
//          print  6
//        code started from here
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter num 1 : ");
//        int num1 = input.nextInt();
//        System.out.print("Enter num 2 :");
//        int num2 = input.nextInt();
//        if (num1 > num2){
//            System.out.println(num1 + " is Greater than num2");
//
//        }
//        if (num2 > num1 ){
//            System.out.println( num2 +" is Greater than num1");
//
//        }
//        if (num1 == num2){
//            System.out.println("num1 is equal to  num2 , Try again!");
//        }




// __________________________________________________________________________________________________________________________________________

//       Question 6  Input currency in rupee and output in dollar.
//       Approach
//        inr = 4000
//        4000inr into ? usd
//        MATHS
//        72.5 inr = 1 usd
//        1 inr = 1/72.5 usd
//        4000inr =  inr * 1/72.5 = inr/72.5
//        Java Program :
        Scanner input = new Scanner(System.in);
        System.out.print("Enter INR Amount to be converted into USD: ");
        float inr = input.nextFloat();
//        float usd = (inr/72.5f);
        System.out.println( inr + " INR is equalls to : " + (inr/72.5f) + " USD");


    }
}
