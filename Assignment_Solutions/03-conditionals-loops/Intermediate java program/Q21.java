// LCM OF TWO NUMBERS 

import java.util.*;
public class Q21 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers to find their LCM: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();

		int LCM = num1>num2 ? num1 : num2;
		for(; LCM <=0 num1*num2; LCM += LCM) {
			if(LCM % num1 == 0 && LCM % num2 == 0) {
				break;
			}
		}
		System.out.println("LCM of " + num1 + " and " + num2 + " = " + LCM);
	}
}