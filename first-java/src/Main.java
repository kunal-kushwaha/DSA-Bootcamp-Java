import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Write a program to print whether a number is even or odd, also take input from the user.
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number to see Odd or Even ");
        int n = in.nextInt();

        if (n %2 == 0) {
            System.out.println(n +" is a Even number.");
        }else {
            System.out.println(n +" is a Odd number.");
        }

         */

//        Take name as input and print a greeting message for that particular name.
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name :");
        String str = in.next();
        System.out.println("Good Morning " + str);

         */

//        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your principal :");
        int p = in.nextInt();
        System.out.println("Please enter your time :");
        int t = in.nextInt();
        System.out.println("Please enter your rate (%):");
        int r = in.nextInt();

        System.out.println("What you want total return (r) or total interest (i) ?");
        char total = in.next().charAt(0);

        if(total == 'r') {
            int sum = p + ((p*r)/100)*t;
            System.out.println("Total return is :" + sum);
        }else if (total == 'i'){
            int interest = ((p*r)/100)*t;
            System.out.println("Total interest is :" + interest);
        }else {
            System.out.println("Enter a valid input!");
        }

         */

//        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int n1 = in.nextInt();
        System.out.println("Please enter an operator :");
        char c = in.next().charAt(0);
        System.out.println("Please enter another number :");
        int n2 = in.nextInt();

        int total = 0;

        if(c == '+') {
            total = n1+n2;
        }else if(c == '-') {
            total = n1-n2;
        }else if(c == '*') {
            total = n1*n2;
        }else if(c == '/') {
            total = n1/n2;
        }else {
            System.out.println("Enter a valid input!");
        }
        System.out.println("Total = " + total);

         */

//        Take 2 numbers as input and print the largest number.
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number to compare :");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        if(n1 > n2) {
            System.out.println(n1 +" is the largest number.");
        }else {
            System.out.println(n2 + " is the largest number.");
        }

         */

//        Input currency in rupees and output in USD.
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Rs to convert into $ :");
        int n = in.nextInt();
        int doler = n/80;
        System.out.println("Rs : " + n + " = " + doler + "$");

         */

//        To calculate Fibonacci Series up to n numbers.
        /*
         Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to get Fibonacci Series :");
         int n = in.nextInt();

         int p = 0;
         int i = 1;
         int count = 2;

         while(count <= n) {
             int temp = i;
             i = p + i;
             p = temp;
             count ++;
         }
        System.out.println(i);

         */

//        To find out whether the given String is Palindrome or not.
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String to see palindrome or not :");
        String str = in.next();
        boolean isPalindrome = false;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(str.length()-(1+i))){
                isPalindrome = true;
            }else {
                isPalindrome = false;
            }
        }
        System.out.println( isPalindrome ? (str + " is a palindrome.") : (str + " is not a plindrome."));

         */

//        To find Armstrong Number between two given number.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter starting number to see Armstrong number :");
        int s = in.nextInt();
        System.out.println("Enter ending number to see Armstrong number :");
        int s2 = in.nextInt();

        for (int i = s; i < s2; i++) {
            int n = i;
            int total = 0;
            while(n>0){
                int rem = n % 10;
                total = total + rem*rem*rem;
                n = n/10;
            }
            if(i==total){
                System.out.println(i + " is an Armstrong number.");
            }
        }

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number to find Armstrong or not :");
//        int input = in.nextInt();
//        int n = input;
//        int total = 0;
//
//
//        while (n > 0) {
//            int rem = n % 10;
//            total = total + rem*rem*rem;
//            n = n /10;
//        }
//
//        if(total == input) {
//            System.out.println(input + " is an Armstrong Number.");
//        }else {
//            System.out.println(input + " is not an Armstrong Number.");
//        }

    }
}