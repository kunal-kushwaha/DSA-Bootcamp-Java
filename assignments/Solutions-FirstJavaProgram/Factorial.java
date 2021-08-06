import java.util.Scanner;
public class Factorial{
	static int Factorial(int n){
		if(n==0)
			return 1;
		else
			return n*Factorial(n-1);
	}
	public static void main(String[] args){
		System.out.print("Enter a number: ");
		Scanner input=new Scanner(System.in);
		int in=input.nextInt();
		System.out.println("Factorial of the number "+in+" is "+Factorial(in));
	}
}