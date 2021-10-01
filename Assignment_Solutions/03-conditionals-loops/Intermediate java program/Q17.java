// Reverse a String
import java.util.Scanner;
public class Q17 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();

		for(int i = str.length(); i>0; i--) {
			System.out.print(str.charAt(i-1));
		}
	}
}