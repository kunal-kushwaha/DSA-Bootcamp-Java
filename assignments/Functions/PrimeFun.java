package com.Functions;

import java.util.Scanner;

public class PrimeFun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
       boolean ans =  isprime(a);
       System.out.print(ans);
    }
    static  boolean isprime(int n){
int c = 2;
if(n<=1){
    return  false;
}
while (c*c<=n){
    if(n%c==0){
        return  false;
    }
    c++;
}
return  c*c>n;
    }
}
