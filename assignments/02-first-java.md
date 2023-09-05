# [Video Link](https://youtu.be/TAtrPoaJ7gc)

## Write Java programs for the following:

1. Write a program to print whether a number is even or odd, also take
input from the user.
```java
import java.util.Scanner;

public class evenOdd_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = input.nextInt();

        if (num%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}
```

2. Take name as input and print a greeting message for that particular name.
```java
import java.util.Scanner;

public class Greeting_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.next();
        System.out.println("Hello !! "+name);
        System.out.println("Good Morning " +name);
    }
}

```

3. Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.
```java
import java.util.Scanner;

public class SimpleInterest_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal Amount : ");
        int principal = input.nextInt();
        System.out.println("Enter Rate of Interest : ");
        int rate = input.nextInt();
        System.out.println("Enter Time : ");
        int time = input.nextInt();

        int simple_interest = (principal*rate*time)/100;
        System.out.println("Simple Interest : "+simple_interest);
    }
}

```
4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)
```java
import java.util.Scanner;

public class Calculator_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double num1 = input.nextDouble();
        System.out.println("Enter second number : ");
        double num2 = input.nextDouble();

        System.out.println("Enter the operator (+, -, *, /) : ");
        char op = input.next().charAt(0);

        if (op == '+') {
            System.out.println("The sum of " + num1 + " and " + num2 + " = " + (num1 + num2));
        } else if (op == '-') {
            System.out.println("The subtraction of " + num1 + " and " + num2 + " = " + (num1 - num2));
        }
        else if (op == '*') {
            System.out.println("The multiplication of " + num1 + " and " + num2 + " = " + (num1 * num2));
        }
        else if (op == '/') {
            System.out.println("The division of " + num1 + " and " + num2 + " = " + (num1 / num2));
        }
        else {
            System.out.println("Invalid Input");
        }

    }
}

```
5. Take 2 numbers as input and print the largest number.
```java
import java.util.Scanner;

public class LargestNumber_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = input.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = input.nextInt();

        if (a>b){
            System.out.println(a+" is the largest number");
        }
        else {
            System.out.println(b+" is the largest number");
        }

    }
}

```
6. Input currency in rupees and output in USD.
```java
import java.util.Scanner;

public class CurrencyConverter_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Amount : ");
        double amt = input.nextDouble();
        System.out.println("Currency Converter");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.print("Enter your choice (1/2): ");
        int choice = input.nextInt();

        if (choice == 1){
            // INR to USD conversion rate
            System.out.println("Converted amount in USD: " + (amt*83.11));
        }
        else if (choice == 2) {
            // USD to INR conversion rate
            System.out.println("Converted amount in INR: " + (amt*0.012));
        }
        else {
            System.out.println("Invalid choice!");
        }

    }
}

```
7. To calculate Fibonacci Series up to n numbers.
```java
public class FibonaciSeries_7 {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i,count=12;
        System.out.println(n1+" "+n2); // printing 0 and 1

        for (i = 2; i < count ; ++i) //loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}

```
8. To find out whether the given String is Palindrome or not.
```java
import java.util.Scanner;

public class StringPalindrome_8 {

    public static void main(String[] args) {
        String a,b = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        a = s.nextLine();
        int n = a.length();
        for(int i = n-1;i>=0;i--){
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b)){
            System.out.println(a+ " is a palindrome");
        }
        else{
            System.out.println(a+ " is not a palindrome");
        }
    }
}
```
9. To find Armstrong Number between two given number.
```java
import java.util.Scanner;

public class Armstrong_9 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :");
        num1 = input.nextInt();
        System.out.println("Enter the second number ::");
        num2 = input.nextInt();

        for (int i = num1; i < num2; i++) {
            int check, rem, sum = 0;
            check = i;
            while(check!=0){
                rem = check%10;
                sum=sum+(rem*rem*rem);
                check=check/10;
            }
            if (sum==i){
                System.out.println(""+i+" is a Armstrong number");
            }
        }
    }
}

```

