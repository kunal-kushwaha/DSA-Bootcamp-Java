package com.first_java_1;

import java.util.Scanner;

public class first_program {
    public static void main(String[] args) {

//   Write a program to print whether a number is even or odd, also take input.

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int user = scanner.nextInt();
//
//        if (user%2==0){
//            System.out.println("Even");
//        }else if(user%2==1) {
//            System.out.println("Odd");
//        }else {
//            System.out.println("Try Again");
//        }


        //  2. Take name as input and print a greeting message for that name.
//        System.out.println("Enter name" +" : ");
//        String name = scanner.nextLine();
//        System.out.println("Good Morning "+ name);
//        System.out.println("Have a Good Day sir");




        // 3. Write a program to input principle, time, and rate (P, T, R) from the user and
        //find Simple Interest.
//        System.out.println("Enter principle time rate ");
//        int principle = scanner.nextInt();
//        int time = scanner.nextInt();
//        int rate = scanner.nextInt();
//
//        int simpleInterest = principle+((principle*time*rate)/100);
//        System.out.println("Simple Inteset : "+simpleInterest);


        // 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.

//        System.out.println("Enter any two value a & b ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println("Add : "+a+b);
//        System.out.format("Subtraction :  %d \n",a-b);
//        System.out.println("Multiply : "+a*b);
//        System.out.println("Divide : "+a/b);
//        System.out.println("Reminder : "+a%b);


        // 5. Take 2 numbers as input and print the largest number.
//
//        System.out.println("Enter any two value a & b ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        if (a<b){
//            System.out.println("B is greatest among "+ a +" "+b);
//            System.out.println("B = "+b);
//        }else if (a>b){
//            System.out.println("A is greatest among"+ a +" "+b);
//            System.out.println("A = "+a);
//
//        }

        // 6 . Input currency in rupees and output in USD.
//        System.out.println("Enter any Rupees : ");
//        int rupees = scanner.nextInt();
//        int USD = (rupees/78);
//        System.out.println("$1 = Rs 78");
//        System.out.print("Rs "+rupees+" = $ "+ USD);
//


        // Extra
        //4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
        //(Use if conditions)

        System.out.println("Enter any two value a & b ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a>b){
            System.out.println("Add : "+a+b);
        }else if(a<b){
            System.out.format("Subtraction :  %d \n",a-b);
        }else if (a>10){
            System.out.println("Multiply : "+a*b);
        }else if (b<20){
            System.out.println("Divide : "+a/b);
        }
        if (a>=5){
            System.out.println("Reminder : "+a%b);
        }


    }
}
