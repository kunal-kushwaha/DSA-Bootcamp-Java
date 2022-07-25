package com.Functions;

import java.util.Scanner;

public class scope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//    1.    any variable created outside can not initialize again in inside a block
//        2. any variable created inside a block can again initialize outside the block
//        3. any  variable initialize outise can use inside.
//            4.     any  variable initialize inside block cannot use outside.
        int a= 10;
        int c = 5;

        {
//            int a= 20;  // 1. can not initialize again
            int b = 3;
            c= 10; //3. can use it
            int k = 10;
        }
       int b = 10;  // 2. can initialize again
//        k =5;   // 4. can not use it
    }
}
