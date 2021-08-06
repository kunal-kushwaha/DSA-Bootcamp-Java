import java.util.Scanner;
public class Greeting{
	public static void main(String[] args){
		System.out.println("Enter your good name:");
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
		System.out.println("Nice to meet you "+name);
	}
}