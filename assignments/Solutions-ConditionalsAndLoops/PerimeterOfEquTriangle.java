import java.util.Scanner;
public class PerimeterOfEquTriangle{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the length of the side in equilateral triangle: ");
		double side,perimeter;
		side=in.nextDouble();
		perimeter=3*side;
		System.out.print("Perimeter of the given equilateral triangle is "+perimeter);
	}
}