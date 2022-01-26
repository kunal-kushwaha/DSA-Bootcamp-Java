package org.bootcamp.dsa.search;

public class EvenNumberedDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {12,345,2,6,7896};
		
		int count = findEvenNumberedDigits(nums);
		
		System.out.println(count);
	}

	private static int findEvenNumberedDigits(int[] nums) {
		// TODO Auto-generated method stub
		int evenSum = 0 ;
		
		for (int num : nums) {
			int count = countDigitsInNum(num);
			if(count%2==0)
					evenSum++;
		}
		
		return evenSum;
	}

	private static int countDigitsInNum(int num) {
		int digitsCount = 0;
		
		while(num!=0) {
			num = num/10;
			digitsCount++;
		}
		
		return digitsCount;
		// TODO Auto-generated method stub
		
	}

}
