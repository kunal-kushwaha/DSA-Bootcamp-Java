package com.Functions;

import java.util.Scanner;

public class parameterFun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = in.nextLine();
        String yourName = name(name);
        System.out.print(yourName);


    }
    static String name( String name){
        String hii = name;
        return "hii"+ hii ;
    }
}
