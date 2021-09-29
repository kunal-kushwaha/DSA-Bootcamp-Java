// 10. perimeter of parallelogram 

import java.util.Scanner;
public class Q10 {
	public static void main(Stringn[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("This program will calculate perimeter of parallelogram.");

		System.out.println("Enter the base and height of parallelogram: ");
		float base = input.nextFloat();
		float height = input.nextFloat();

		float PerimeterOfParallelogram = 2*base*height;
		System.out.println("Perimeter of Parallelogram = " + PerimeterOfParallelogram); 
	}
}