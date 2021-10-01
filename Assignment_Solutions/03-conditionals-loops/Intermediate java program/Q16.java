// Find NPR and NCR in java
// permutatoin and combinations

import java.util.*;


public class Q16 {
	public static void main(String ...args) {
		Scanner input = new Scanner(System.in);

		System.out.println("n = Total number of item in the set.");
		System.out.println("r = Item to be selected for permutations and combinations");
		System.out.println("Enter the n and r: ");
		
		int n = input.nextInt();
		int r = input.nextInt();

		permutation(n, r);
		combination(n, r);
	}

	static int factorial(int x) {
		int fact = 1;
		while(x>0) {
			fact *= x;
			x--;
		}
		return fact;
	}

	static void permutation(int n, int r) {
		int numerator = factorial(n);
		int denominator = factorial(n-r);

		float per = numerator/denominator;
		System.out.println(n + "P" + r +  "="  + per);
	}

	static void combination(int n, int r) {
		int numerator = factorial(n); 
		int denominator = factorial(n-r)*factorial(r);

		float comb = numerator/denominator;

		System.out.println(n + "C"+ r + "="  + comb);
	}


}