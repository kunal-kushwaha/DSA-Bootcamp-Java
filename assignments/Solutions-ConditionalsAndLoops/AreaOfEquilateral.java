import java.util.Scanner;
public class AreaOfEquilateral{
	public static void main(String[] args){
		double side,area;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the length of the side of equilateral triangle: ");
		side=in.nextDouble();
		area=(1.73*side*side)/4;
		System.out.print("Area= "+area);
	}
}