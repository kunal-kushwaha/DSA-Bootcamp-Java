package com.Functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        multiple(1,2,"hey","how");
    }
    static void multiple(int a, int c, String ...b)
    {
        System.out.print(Arrays.toString(b));
    }
}
