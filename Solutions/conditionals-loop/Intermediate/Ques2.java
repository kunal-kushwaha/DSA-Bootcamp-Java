package Intermediate;

import java.util.Scanner;
/*
Calculate Electricity Bill
1 to 100 units – Rs. 10/unit
100 to 200 units – Rs. 15/unit
200 to 300 units – Rs. 20/unit
above 300 units – Rs. 25/unit
 */
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units: ");
        double units = sc.nextDouble();

        if (units <= 100) System.out.println(units * 10);
        else if (units <= 200) System.out.println((100 * 10) + (units - 100) * 15);
        else if (units <= 300) System.out.println((100 * 10) + (100 * 15) + (units - 200) * 20);
        else if (units > 300) System.out.println((100 * 10) + (100 * 15) + (100 * 20) + (units - 300) * 25);
    }

}
