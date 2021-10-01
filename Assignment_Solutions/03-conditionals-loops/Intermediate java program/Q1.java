// Factorial program in java.

import java.io.*;
import java.util.*;
public class Q1 {
	public static void main(String ...args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number to find it's factorial: ");
		int num = input.nextInt();
		int counter = num;
		int multiply = 1;
		while(counter>0) {
			multiply *= counter;
			counter -= 1;
		}
		System.out.println(num + "! = " + multiply );
	}
}