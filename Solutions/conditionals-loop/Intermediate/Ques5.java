package Intermediate;

import java.util.Scanner;

// Calculate Distance Between Two Points
public class Ques5 {
    public static void main(String[] args) {
        /*
        We will use the distance formula derived from Pythagorean theorem.
        The formula for distance between two point (x1, y1) and (x2, y2) is
        Distance = sqrt{(x2-x1)^{2} + (y2-y1)^{2}}$
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x1: ");
        float x1 = sc.nextFloat();
        System.out.println("Enter the y1: ");
        float y1 = sc.nextFloat();
        System.out.println("Enter the x2: ");
        float x2 = sc.nextFloat();
        System.out.println("Enter the y2: ");
        float y2 = sc.nextFloat();
        float distance = (float) Math.sqrt((Math.pow((x2-x1), 2) + (Math.pow((y2-y1), 2))));

        System.out.printf("Distance between two pint is: %f", distance);
    }
}
