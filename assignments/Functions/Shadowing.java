package com.Functions;

public class Shadowing {
     static int x= 10; // global scope, global variable
    public static void main(String[] args) {
        System.out.println(x); // 10
        int x ; // the class variable at line 4 is shadowed by this
//        System.out.println(x); // will give an error , scope will begin when value is initialised
        x= 20;
        System.out.println(x); // 20 ,
        fun();
    }
    static  void fun()
    {
        System.out.println(x) ; //10
    }
}
