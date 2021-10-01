import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N: "); 
		int N = input.nextInt();

		System.out.println("Enter numbers: ");
		float numbers ;
		float sum = 0;
		for(int i = 1; i<=N; i++ )
		{
			numbers = input.nextFloat();
			sum += numbers;

		}
		System.out.println("Sum of Numbers: " + sum);

	}
}