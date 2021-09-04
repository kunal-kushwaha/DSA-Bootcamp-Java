Solutions: 
1  Leap year or Not
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // The desired year to check.
        Scanner input= new Scanner(System.in);
        int year = input.nextInt();
        // Implementing our algorithm.
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}

2 Sum of Two Numbers
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is" +sum);
    }
}


3 Multiplication table
import java.util.Scanner;
public class Multiplication_Table 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
	System.out.print("Enter number:");        
	int n=s.nextInt();
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}

4 Two numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class lcmGCD
{
    public static void main(String args[])
    {
        int n1,n2;
        int gcd,lcm,remainder,numerator,denominator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        if (n1>n2)
        {
            numerator=n1;
            denominator=n2;
        }
        else
        {
            numerator=n2;
            denominator=n1;
        }
        remainder=numerator%denominator;
        while(remainder!=0)
        {
            numerator=denominator;
            denominator=remainder;
            remainder=numerator%denominator;
        }
        gcd = denominator;
        lcm = n1*n2/gcd;
        System.out.println("GCD of "+n1+" and "+n2+" = "+gcd);
        System.out.println("LCM of "+n1+" and "+n2+" = "+lcm);
    }
}

5
