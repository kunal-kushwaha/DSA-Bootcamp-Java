package Intermediate;

import java.util.Scanner;

// Calculate Average Of N Numbers
public class Ques3 {
    static int avg(int ...n){
        int sum = 0;
        int avg = 0;
        for (int num:n){
            sum+=num;
        }
        return sum/n.length;
    }

    public static void main(String[] args) {
        System.out.println(avg(2,2,2,2));  // enter numbers as per the requirements
    }
}
