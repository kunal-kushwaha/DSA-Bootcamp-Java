package Intermediate;
// Compound Interest Java Program
public class Ques11 {
    public static void main(String[] args) {
        /*
        Compound Interest = Amount - principle
        Amount = P(1 + R/100)^t
        Where,
        P is principle amount
        R is the rate and
        T is the time span
         */

        double principle = 10000, rate = 5, time = 2;

        /* Calculate compound interest */
        double A = principle * (Math.pow((1 + rate / 100), time));
        double CI = A - principle;

        System.out.println("Compound Interest is "+ CI);
    }
}
