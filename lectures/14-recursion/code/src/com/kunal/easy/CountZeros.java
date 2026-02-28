package com.kunal.easy;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(30210004));
    }

    static int count(int n) {
        if (n%10==n) return 0;//Breakpoint
        if((n%10)==0) return 1+countZero(n/10);//For every zero adding one to return;
        return countZero(n/10);
    }
}
