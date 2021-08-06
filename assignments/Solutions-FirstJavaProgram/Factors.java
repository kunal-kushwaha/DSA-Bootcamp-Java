import java.util.Scanner;
public class Factors{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		int i=1;
		System.out.printf("The factors of %d are: ",num);
		do{
			if(num%i==0)
				System.out.printf("%d ",i);
			i++;
		}
		while(i<=num);
	}
}

