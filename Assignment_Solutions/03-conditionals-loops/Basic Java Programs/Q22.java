import java.util.Scanner;

public class Q22 {

	public static void ProductAndSum(int n) {
		int sum = 0 , product = 1;
		while(n>0) {
			int lastdigit = n%10;
			product *= lastdigit;
			sum += lastdigit;
			n /= 10;
		}
		int result = product - sum;
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();
		ProductAndSum(n);
	}
}