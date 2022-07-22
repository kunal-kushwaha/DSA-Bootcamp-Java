package Intermediate;

import java.util.Scanner;

// Future Investment Value
public class Ques18 {
    public static void main(String[] args) {
        /*
        FV = PVx(1+i)^n
        where:
            Fv = Future value
            Pv = Present value
            i = interest paid by the investment
            n = time period
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value: ");
        double p=sc.nextInt();
        System.out.print("Enter the interest rate: ");
        double r=sc.nextInt();
        System.out.print("Enter the time period in years: ");
        double y=sc.nextInt();
        double f=p*Math.pow((1+r/100),y);
        System.out.print("value is: "+f);
    }
}
