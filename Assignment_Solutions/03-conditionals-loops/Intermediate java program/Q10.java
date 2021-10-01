// Calculate CGPA java program
import java.util.Scanner;
public class Q10 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your semester: ");
		int sem = in.nextInt();

		float SGPA = 0;
		float TotalSGPA = 0;
		float CGPA = 0;

		System.out.println("Enter all semester SGPA till " + sem + ": ");
		for(int i = 1; i<=sem; i++) {
			SGPA = in.nextFloat();
			TotalSGPA += SGPA;
		}

		CGPA = TotalSGPA/sem;
		System.out.println("Your CGPA: " + CGPA);

	}
}