package com.kunal;

public class Comparison {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";
        String c = a;
//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}
