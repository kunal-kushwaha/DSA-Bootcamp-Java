package com.ajit;

import java.util.Scanner;

public class Assignment_sumofall {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float result=0;
        String in=input.next();
        while(!in.equals("x") && !in.equals("X")){
            result=result+ Integer.valueOf(in);
            in=input.next();
        }
        System.out.println("Total Sum:"+result);
        input.close();
    }
}
