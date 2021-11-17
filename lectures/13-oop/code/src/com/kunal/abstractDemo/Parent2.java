package com.kunal.abstractDemo;

public abstract class Parent2 {

    int age;
    final int VALUE;

    public Parent2(int age) {
        this.age = age;
        VALUE = 32456789;
    }

    static void hello(){
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();
}
