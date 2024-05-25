package com.ajit;

import java.util.Scanner;

public class Assignment_HCF_LCM{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number1:");
        int lowerNum=input.nextInt();
        System.out.println("Please enter number2:");
        int higherNum=input.nextInt();
        input.close();
        /*Fix lower and higher numbers */
        if(lowerNum>higherNum){
            int temp=lowerNum;
            lowerNum=higherNum;
            higherNum=temp;
        }
        int remainder=1;
        int divisor,dividend;
        divisor=lowerNum;
        dividend=higherNum;
        while(remainder!=0){
           remainder=dividend%divisor;
           dividend=divisor;
           if(remainder==0){break;}
           divisor=remainder;

        }
        System.out.println("HCF:"+divisor);
        int lcm=(lowerNum*higherNum/divisor);
        System.out.println("LCM:"+lcm);
    }
}