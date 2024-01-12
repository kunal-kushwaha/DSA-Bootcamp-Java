import java.util.Scanner;
public class InputandSum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		int sum=n1+n2;
		System.out.print("Whats your name?");
		String name=sc.next();
		System.out.println("The numbers are provided by the user "+name);
		System.out.println("Sum of the given numbers n1="+ n1 +" and n2="+ n2 +" is" + sum);
	}
}
		
