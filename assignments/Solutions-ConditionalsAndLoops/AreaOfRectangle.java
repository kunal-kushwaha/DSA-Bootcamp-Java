import java.util.Scanner;
public class AreaOfRectangle{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double length,breadth,area;
		System.out.print("Enter the length of the rectangle: ");
		length=in.nextDouble();
		System.out.print("Enter the breadth of the rectangle: ");
		breadth=in.nextDouble();
		area=length*breadth;
		System.out.printf("The area of the given rectangle is %.2f",area);
	}
}