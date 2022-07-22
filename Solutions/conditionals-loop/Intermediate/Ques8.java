package Intermediate;

import java.util.Scanner;

// Calculate Depreciation of Value
public class Ques8 {
    public static void main(String[] args) {
        /*
        The value of any article or item subject to wear and tear, decreases with time.
        This decrease is called its Depreciation. Given three variable V1, R and T where V1 is the initial value,
        R is the rate of depreciation and T is the time in years. The task is to find the value of the item after T years.

        Approach: As in Compound Interest, interest is regularly added to the principal at the end of the agreed intervals of time to generate
        a new and fresh principal. Similarly, Depreciated value is the decreased value from the amount at the end of agreed intervals of time
        to generate a new Value.
        Thus if V1 is the value at a certain time and R% per annum is the rate (the rate can not be more than 100%)
        of depreciation per year, then the value V2 at the end of T years is:

        Formula = V2 = V1[1-r/100]^t

           the explanation is from geeksforgeeks (https://www.geeksforgeeks.org/program-to-find-the-depreciation-of-value/)
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial value: ");
        float V1 = sc.nextFloat();
        System.out.println("Enter the rate: ");
        float r = sc.nextFloat();
        System.out.println("Enter the time: ");
        float t = sc.nextFloat();

        float Depreciation = (float) (V1 * Math.pow((1 - r / 100), t));
        System.out.printf("Depreciation: %f" , Depreciation);
    }
}
