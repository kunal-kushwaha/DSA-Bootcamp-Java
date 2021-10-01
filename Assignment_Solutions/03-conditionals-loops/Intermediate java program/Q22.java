// Vowel and Cnsonant

import java.util.*;
public class Q22 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter any Character to check whether it is a vowel or consonant: ");
		char ch = in.next().trim().charAt(0);

		int i = 0;

			switch (ch) {
				case 'a', 'e' , 'i' ,'o' ,'u', 'A', 'E', 'I', 'O', 'U' -> i++;
			}

		if(i==1) {
			System.out.println("vowel");
		}
		else if(ch > 'a' && ch <'z' || ch > 'A' && ch < 'z') {
			System.out.println("Consonant");
		}
		else
			System.out.println("Neither vowel nor consonant");

	}
}