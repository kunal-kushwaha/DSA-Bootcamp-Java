import java.util.Scanner;
public class Currency{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount in rupees: ");
		float rupees=sc.nextFloat();
		double dollars=rupees/74.10;
		System.out.printf("%.2f Dollars",dollars);
	}
}