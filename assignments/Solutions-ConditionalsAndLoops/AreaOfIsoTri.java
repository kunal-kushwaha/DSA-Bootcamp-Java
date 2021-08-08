import java.util.Scanner;
import java.io.*;
public class AreaOfIsoTri{
	//function to find the altitude
	 static float altitude(float a,float b){
		return (float)(Math.sqrt(Math.pow(a,2)-(Math.pow(b,2)/4)));
	}
	//function to find the area
	static float area(float b,float h){
		return (b*h)/2;
	}
	//Driver code
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		float a,b,h,area;
		System.out.print("Enter the length of base: ");
		b=in.nextFloat();
		System.out.print("Enter the length of the equally sized side: ");
		a=in.nextFloat();
		h=altitude(a,b);
		area=area(b,h);
		System.out.printf("Area= %.2f",area);

	}
}