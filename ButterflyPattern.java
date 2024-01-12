import java.util.*;
public class ButterflyPattern{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows to be printed");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			   for(int k=i;k>0;k--)
				   System.out.print("*");
			   for(int k= 2*n-(2*i);k>0;k--)
					System.out.print(" "); 
			   for(int k=i;k>0;k--)
				System.out.print("*"); 
			
			System.out.print("\n");
		}
		
		for(int i=n-1;i>=1;i--){
			   for(int k=i;k>0;k--)
				   System.out.print("*");
			   for(int k= 2*n-(2*i);k>0;k--)
					System.out.print(" "); 
			   for(int k=i;k>0;k--)
				System.out.print("*");
			
			System.out.print("\n");
		}
	}
}