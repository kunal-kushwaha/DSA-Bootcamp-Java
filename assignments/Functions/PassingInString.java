package com.Functions;

import java.util.Scanner;

public class PassingInString {
    public static void main(String[] args) {
       // change string
        Scanner in =  new Scanner(System.in);
        String name = "meeta";
        changeName(name);
        System.out.print(name);
    }
  static  void changeName( String newName)
  {
      newName = "meeta haldar";
  }
}

