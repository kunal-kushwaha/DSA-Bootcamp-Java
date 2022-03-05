package com.kunal;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Kunal";
        {
//                int a = 78; // already initialised outside the block in the same method, hence you cannot initialise again
                a = 100; // reassign the origin ref variable to some other value
            System.out.println(a);
                int c = 99;
                name = "Rahul";
            System.out.println(name);
                // values initialised in this block, will remain in block
        }
        int c = 900;
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); // cannot use outside the block

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
//            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println();
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
