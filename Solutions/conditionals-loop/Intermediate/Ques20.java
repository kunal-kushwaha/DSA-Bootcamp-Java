package Intermediate;
// LCM Of Two Numbers
public class Ques20 {
    public static void main(String[] args) {  // Please visit => https://www.javatpoint.com/lcm-of-two-numbers-in-java to understand the logic
        int a = 12, b = 9, gcd = 1;
        //finds GCD
        for(int i = 1; i <= a && i <= b; ++i) {
            if(a % i == 0 && b % i == 0)
                gcd = i;
        }
        int lcm = (a * b) / gcd;
        System.out.printf("The LCM of %d and %d is: %d.", a, b, lcm);
    }
}
