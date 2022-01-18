package com.Functions;

import java.util.Scanner;

public class stringReturnFun {
    public static void main(String[] args) {
        String yourName =    name();
System.out.print(yourName);
    }
    static  String name (){


        Scanner in = new Scanner(System.in);
        String a = "hii";
        return a + " hello";
    }
}
