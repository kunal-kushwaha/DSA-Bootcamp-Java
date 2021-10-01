// Calculate Depreciation of Value
import java.util.Scanner;
public class Q8 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Ammount: ");
		float Ammount = in.nextFloat();

		System.out.println("Enter Depriciation percentage: ");
		float DepPer = in.nextFloat();

		System.out.println("Enter years: ");
		float years = in.nextFloat();

		float temp = Ammount; 
		for(int i = 0; i<years; i++) {
			temp = ((100-DepPer)*temp)/100;
		}

		System.out.println("After Depriciation = " + temp);
	}
}