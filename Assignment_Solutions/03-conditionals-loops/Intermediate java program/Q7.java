// power in java

import java.util.Scanner;
public class Q7 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int number = in.nextInt();

		System.out.println("Enter the power: ");
		int power = in.nextInt();

		int ans = 1;
		for(int i = 1; i<=power; i++)
		{
			ans *= number;
		}

		System.out.println(number + "^" + power + " = " + ans);
	}
}