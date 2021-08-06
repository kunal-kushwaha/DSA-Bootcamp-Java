import java.util.Scanner;
public class LargestAmongTwo{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1=input.nextInt();
		System.out.print("Enter an another number: ");
		int num2=input.nextInt();
		if(num1>num2)
			System.out.println("The largest number among two is "+num1);
		else
			System.out.println("The largest number among two is "+num2);
	}
}