package com.kunal;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun();
//        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
//        demo();
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
