package com.harsh.Basic;

import java.util.Scanner;

public class Ques22 {
    public static int subtractProductAndSum(int n) {
        int copy = n;
        int product = 1;
        int sum = 0;
        while(copy !=0){
            int d = copy%10;
            product*=d;
            sum+=d;
            copy/=10;
        }
        return product-sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(subtractProductAndSum(num));
    }
}
