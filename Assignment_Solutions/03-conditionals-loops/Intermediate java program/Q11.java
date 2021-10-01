//11. compound interest program
import java.util.*;
public class Q11 {
	public static void main(String ...args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter principle, rate and time: ");
		int principle = input.nextInt();
		double rate = input.nextFloat();
		float time = input.nextInt();

		rate = (1+rate/100);
		rate = Math.pow(rate,time);

		double amount = principle * rate;
		System.out.println("Amount = " + amount);

		double CI = amount - principle;

		System.out.println("Compound Interest = " + CI);

	}
}