import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double area,base,height;
		System.out.print("Enter base: ");
		base=in.nextDouble();
		System.out.print("Enter height: ");
		height=in.nextDouble();
		area=(base*height)/2;
		System.out.print("Area of the triangle is "+area);
	}
}