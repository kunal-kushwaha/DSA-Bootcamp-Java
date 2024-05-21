package com.ajit;

import java.util.Scanner;

public class TypeCasting2 {
    public static void main(String[] args) {
        //explicit type casting or conversion 
        byte n=(byte)258;
        //byte range is 1-256. over that range it does number%256-remainder
        //meaning the below will print 257%256=1
        System.out.println(n);
    }
}
