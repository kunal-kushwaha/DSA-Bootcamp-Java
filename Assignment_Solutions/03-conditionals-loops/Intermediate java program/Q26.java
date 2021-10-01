//  26. Kunal is allowed to go out with his friends only on the even days of a given month. 
//  Write a program to count the number of days he can go out in the month of August.

public class Q26 {
	public static void main(String ...args) {
		int DaysInAugust = 31;
		int count = 0;
		for(int i = 1; i<=DaysInAugust; i++) {
			if(i%2 == 0) {
				count += 1;
			}
		}
		System.out.println("Kunal can go " + count + " days outside with his friends in the month of August");
	}
}