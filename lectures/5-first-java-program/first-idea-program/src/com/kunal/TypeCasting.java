package com.kunal;

import java.util.Scanner;

public class TypeCasting {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                // We are inputting integer but, it is auto casting to float.
                // However auto casting only works for smaller to bigger data types.
                float flt = nextInt();

                // type casting

                // Convert float to integers
                int num = (int) (67.56f);
                System.out.println(num);

                // Convert int to byte
                int a = 257;
                byte b = (byte) (a); // 257 % 256 = 1

                // automatic type promotion in expressions

                // Given bytes are automatically converted to integers when we multiply them.
                // This is called automatic type promotion
                byte a = 40;
                byte b = 50;
                byte c = 100;
                int d = a * b / c;
                System.out.println(d);

                // byte b = 50;
                // b = b * 2;

                // Here character will get converted to it's Unicode value
                int number = 'A';
                System.out.println(number);

                // We can print any Unicode character in Java
                // System.out.println("你好");
                // System.out.println(3 * 6);

                byte b = 42;
                char c = 'a';
                short s = 1024;
                int i = 50000;
                float f = 5.67f;
                double d = 0.1234;
                double result = (f * b) + (i / c) - (d * s);
                // float + int - double = double
                System.out.println((f * b) + " " + (i / c) + " " + (d * s));
                System.out.println(result);
        }
}
