import java.util.Scanner;
public class AreaOfRhombus{
	public static void main(String[] args){
		double diagonal1,diagonal2,area;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter 1st diagonal: ");
		diagonal1=in.nextDouble();
		System.out.print("Enter 2nd diagonal: ");
		diagonal2=in.nextDouble();
		area=diagonal2*diagonal1;
		System.out.print("Area= "+area);
	}
}