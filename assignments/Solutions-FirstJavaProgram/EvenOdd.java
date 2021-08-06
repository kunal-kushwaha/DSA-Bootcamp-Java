import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int in=input.nextInt();
		String evenOdd=(in%2==0)?"even":"odd";
		System.out.println(in+" is "+evenOdd);

	}
}