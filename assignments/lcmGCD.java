import java.util.*;
class lcmGCD{
	public static void main(String[] args){
		int n1,n2,gcd,lcm,numerator,denominator,remainder;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		if(n1>n2){
			numerator=n1;
			denominator=n2;
		}
		else{
			numerator=n2;
			denominator=n1;
		}
		remainder=numerator%denominator;
		while(remainder!=0){
			numerator=denominator;
			denominator=remainder;
			remainder=numerator%denominator;
		}
		gcd=denominator;
		lcm=n1*n2/gcd;
		System.out.println("GCD of "+n1+" and "+n2+" = "+gcd);
		System.out.println("LCM of "+n1+" and "+n2+" = "+lcm);
	}
}	
