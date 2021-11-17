package com.kunal.easy;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = prod(505);
        System.out.println(ans);
    }
    
    static int prod(int n) {
        if (n%10 == n) {
            return n;
        }
        return (n%10) * prod(n/10);
    }
}
