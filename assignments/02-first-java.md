# [Video Link](https://youtu.be/TAtrPoaJ7gc)

## Write Java programs for the following:

1. Write a program to print whether a number is even or odd, also take
input from the user.
2. Take name as input and print a greeting message for that particular name.
3. Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.
4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)
5. Take 2 numbers as input and print the largest number.
6. Input currency in rupees and output in USD.
7. To calculate Fibonacci Series up to n numbers.
8. To find out whether the given String is Palindrome or not.
9. To find Armstrong Number between two given number.

import java.util.*;

// program to print whether a number is even or odd, also take input from the user.
public class First{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = input.nextInt();
        
        if(number % 2 == 0){
            System.out.print("The given number is even");
        }
        else
            System.out.print("The given number is odd");

    }
}

//Take name as input and print a greeting message for that particular name
public class First{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Have a good day"+ " "+ name);

    }
}

//input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class First{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int p,t;
        float r;
        System.out.print("Enter the principal amount :");
        p = input.nextInt();
        System.out.print("Enter the time :");
        t = input.nextInt();
        System.out.print("Enter the rate :");
        r = input.nextFloat();
        float simpleIntrest = (p * t * r) / 100;
        System.out.print("Simple Intrest = "+ simpleIntrest); 

    }
}

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class First{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number :");
        int num1 = input.nextInt();
        System.out.print("Enter the second number :");
        int num2 = input.nextInt();
        int result = 0;

        System.out.println("Select the Operation : + - * /  ");

        char operand = input.next().charAt(0);

        if(operand == '+'){
            result = num1 + num2;
        }
        else if(operand == '-'){
            result = num1 - num2;
        }
        else if(operand == '*'){
            result = num1 * num2;
        }
        else{
            result = num1 / num2;
        }

        System.out.print(result);

    }
}
 
//Take 2 numbers as input and print the largest number
public class First{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number :");
        int num1 = input.nextInt();

        System.out.print("Enter the second number :");
        int num2 = input.nextInt();

        if(num1 > num2){
            System.out.print("Greatest number is : "+ num1);
        }
        else
            System.out.print("Greatest number is : "+ num2);
        

    }
}


//Input currency in rupees and output in USD
public class First{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Rupees value :");
        double value = input.nextDouble();

        double usd = value / 83.15;

        System.out.print("INR TO USD IS :"+usd);
    }
}


//To calculate Fibonacci Series up to n numbers
public class First{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int a = 0, b = 1, c, num;

        num = input.nextInt();

        if(num == 1){
            System.out.print(a);
        }
        else{
            System.out.print(a + " "+ b + " ");
        }

        for(int i=2; i<num; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}

//To find out whether the given String is Palindrome or not.
public class First{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int a = 0, b = 1, c, num;

        num = input.nextInt();

        if(num == 1){
            System.out.print(a);
        }
        else{
            System.out.print(a + " "+ b + " ");
        }

        for(int i=2; i<num; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}

//To find Armstrong Number between two given number.
public class First{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for(int i=num1; i<=num2; i++){
            int sum = 0, org = 0;
            int n = (int)Math.log10(i)+1;
            org = i;

            while(org != 0){
                int digit = org % 10;
               
                sum = sum + (int)Math.pow(digit,n);
                org = org / 10;
            

                if(sum == i){
                    System.out.print(i + " ");
                }
            }
        }
    }
}


//To find out whether the given String is Palindrome or not.
public class First{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        String orginal = name;
        String reverse = "";

        for(int i=name.length()-1; i>=0 ; i--){

            reverse = reverse + name.charAt(i);

        }
        
        if(orginal.equals(reverse)){
            System.out.println("The given String is Palindrome ");
        }
        else{
            System.out.print("Not Palindrome");
        }
            
    }
}
//added solution 