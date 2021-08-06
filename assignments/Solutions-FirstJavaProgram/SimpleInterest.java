import java.util.Scanner;
public class SimpleInterest{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int principle,time,rate;
		System.out.print("Enter the Principle amount: ");
		principle=in.nextInt();
		System.out.print("Enter the time: ");
		time=in.nextInt();
		System.out.print("Enter the rate: ");
		rate=in.nextInt();
		float SI=(principle*time*rate)/100;
		System.out.printf("The Simple Interest is %.4f",SI);
	}
}