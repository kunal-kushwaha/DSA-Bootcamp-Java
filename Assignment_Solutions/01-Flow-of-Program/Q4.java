import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two number to find their LCM and HCF: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		int LCM = 1;
		int HCF = 1;

		LCM = (num1>num2) ? num1 : num2;

		while(LCM < num1*num2) {
			if(LCM%num1 == 0 && LCM%num2 == 0) {
				break;
			}
			LCM += LCM;
		}

		HCF = (num1*num2)/LCM;

		System.out.println("LCM = " + LCM + " and " + " HCF = " + HCF);
	}
}