package com.Functions;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        fun();
    }
    static  void fun(){
        System.out.print("hii");
    }
    static  void fun(int a, int b){
        System.out.println(a);
        System.out.println(b);

    }

    static  void fun( int a, String ...b){
        System.out.println(a);
        System.out.println(Arrays.toString(b));


    }


}
