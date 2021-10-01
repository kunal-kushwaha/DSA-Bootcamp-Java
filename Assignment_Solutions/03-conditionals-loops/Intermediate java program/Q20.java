// Hcf of two numbers.

import java.util.*;
public class Q20 {
	public static void main(String ...args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter two number to find their HCF: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();


		int HCF = num1<num2? num1 : num2;
		for(; HCF >= 1 ; HCF --)
		{
			if(num1 % HCF == 0 &&  num2 % HCF == 0) {
				break;
			}
		}
		System.out.println("HCF is " + HCF);
	}
}