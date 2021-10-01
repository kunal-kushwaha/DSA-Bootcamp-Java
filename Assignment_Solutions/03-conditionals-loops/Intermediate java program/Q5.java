// Calculate Distance between two points

import java.util.*;
import java.io.*;

public class Q5 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter x1 and y1 points: ");
		int x1 = in.nextInt();
		int y1 = in.nextInt();

		System.out.println("Enter y2 and x2 points: ");
		int x2 = in.nextInt();
		int y2 = in.nextInt();

		double distance = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));

		System.out.println("Distance between " + "("+x1+","+y1+")" + " and " + "("+x2+","+y2+")" + " is " + distance);
	}
}