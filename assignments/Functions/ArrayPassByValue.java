package com.Functions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPassByValue {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int [] arr = {1,5,4,3};
        change (arr);
        System.out.print(Arrays.toString(arr));
    }
    static  void  change(int [] array){
        array[0]=10;
    }
}
