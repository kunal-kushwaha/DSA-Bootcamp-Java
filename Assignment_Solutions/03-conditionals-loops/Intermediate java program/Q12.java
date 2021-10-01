// Calculate Aeverage marks
import java.util.*;
public class Q12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of subjects: "); 
		int sub = input.nextInt();

		float TotalMarks = 0;
		float AvgMarks = 0;
		System.out.println("Enter Marks in all subjects: ");
		float marks;
		for(int i = 1; i<=sub; i++) {
			marks = input.nextFloat();
			TotalMarks += marks;
		}	
		AvgMarks = TotalMarks/sub;
		System.out.println("Average marks = " + AvgMarks);
	}
}