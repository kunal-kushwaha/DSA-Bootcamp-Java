import java.util.Scanner;
public class Arithmetic{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1=input.nextInt();
		System.out.print("Enter an another number: ");
		int num2=input.nextInt();
		System.out.print("Enter an opertor(+,-,*,/):");
		char op=input.next().charAt(0);
		if(op=='+')
			System.out.println(num1+"+"+num2+"= "+(num1+num2));
		else if(op=='-')
			System.out.println(num1+"-"+num2+"= "+(num1-num2));
		else if(op=='*')
			System.out.println(num1+"*"+num2+"= "+(num1*num2));
		else if(op=='/')
			System.out.println(num1+"/"+num2+"= "+(num1/num2));
		else
			System.out.println("Error: Enter a valid operator!!");
	}
}