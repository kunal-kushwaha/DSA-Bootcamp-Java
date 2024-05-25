package com.ajit;
import java.util.Scanner;

public class Assignment_LeapYearChecker{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a year:");
        int year=input.nextInt();
        //if((year%4==0 && year%100!=0)||(year%4==0 && year%100==0 && year%400==0)){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){    
            System.out.println("Year Entered is a Leap Year");
        }
        else
        {
            System.out.println("Year Entered is not a Leap Year");
        }
        input.close();
    }

}