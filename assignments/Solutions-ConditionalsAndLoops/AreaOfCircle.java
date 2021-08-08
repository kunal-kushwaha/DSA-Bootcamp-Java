import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String args[]){
		System.out.print("Enter the radius: ");
		Scanner in=new Scanner(System.in);
		int radius=in.nextInt();
		double area=(3.14)*(radius*radius);
		System.out.printf("The area of the circle is %.2f",area);
	}
}