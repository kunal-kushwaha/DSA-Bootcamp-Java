import java.util.*;
public class Pattern1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows to be printed");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--) {
			   if(j%2==0)
				   System.out.print("0");
			   else
				   System.out.print("1");
			}
			System.out.print("\n");
		}
	}
}

/* solution 2

for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			   int sum=i+j;
			   if(sum%2==0)
				   System.out.print("1");
			   else
				   System.out.print("0");
			}
			System.out.print("\n");
		}
*/