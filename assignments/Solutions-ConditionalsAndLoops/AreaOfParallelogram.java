import java.util.Scanner;
public class AreaOfParallelogram{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double height,base,area;
		System.out.print("Enter base: ");
		base=in.nextDouble();
		System.out.print("Enter height: ");
		height=in.nextDouble();
		area=base*height;
		System.out.print("Area= "+area);
	}

}