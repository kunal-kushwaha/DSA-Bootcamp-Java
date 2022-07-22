package com.harsh.Basic;
// Input a number and print all the factors of that number
public class Ques23 {
    static void printFactors(int num){

/*     normal optimised approach will print repetitive and jumble factors
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num%i == 0){
                if (num/i == i) System.out.print(i + " ");
                else System.out.print(i +" "+ num/i + " ");
            }
        }
*/

        int i; //loop variable
        // to avoid double printing
        boolean flag = false;
        for(i = 1; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
                System.out.print(i + " ");

            // To avoid double printing of equal pairs
            // Example (10,10) we only want to print once
            if(i == num/i)
                flag = true;
        }

        // if flag is true then we had double pairs like (10,10)
        // we should do i-- so as not to do double printing of pair divisor
        // doing i -=2 rather than i-- as in previous for loop we exited
        // with i++, example, i = 10 became 11 and we need to start with 9
        // so as to ignore 10 as its a double pair
        if(flag) i -= 2;

        // printing pairs
        for(; i >= 1; i--) {
            if (num % i == 0)
                System.out.print(num/i + " ");
        }
    }
    public static void main(String[] args) {
        printFactors(36);
    }
}
