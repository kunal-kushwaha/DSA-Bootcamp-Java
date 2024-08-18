package com.kunal.singleton;

import com.kunal.access.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all 3 ref variables are pointing to just one object

        A a = new A(10, "Kunal");
        a.getNum();
//        int n = a.num;
    }
}
