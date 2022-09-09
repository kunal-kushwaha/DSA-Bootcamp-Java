
import java.io.*;
import java.util.Scanner;

class GFG {
	public static boolean isPalindrome(String str)
	{
		// Initializing an empty string to store the reverse
		// of the original str
		String reveString = "";

		// Initializing a new boolean variable for the
		// answer
		boolean ans = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			reveString = reveString + str.charAt(i);
		}

		// Checking if both the strings are equal
		if (str.equals(reveString)) {
			ans = true;
		}
		return ans;
	}
	public static void main(String[] args)
	{
        Scanner scan = new Scanner(System.in);
		// Input string
		String str = scan.nextLine();

		// Convert the string to lowercase
		str = str.toLowerCase();
		boolean A = isPalindrome(str);
		if (A) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
	}
}
