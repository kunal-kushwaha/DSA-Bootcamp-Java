// calculate Batting Average
import java.util.*;
public class Q9 {
	public static void main(String ...args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of innings played by the batsman: ");
		int innings = in.nextInt();
		System.out.println("Enter run scored by batsman in each inning: ");
		int runs = 0;
		int TotalRun = 0;
		int temp = innings;
		for (;temp>0;) {
			runs = in.nextInt();
			TotalRun += runs;
			temp --;
		}

		float BattingAvg = TotalRun/innings;
		System.out.println("Batting Average = " + BattingAvg);

	}
}