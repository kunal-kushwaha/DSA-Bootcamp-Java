import java.util.Scanner;
import java.util.Date;
class Palindrome{
	public static void main(String args[]){
		String name;
		int i,j,n,flag=0;
		System.out.println("Enter the Word");
		Scanner sc=new Scanner(System.in);
		name = sc.next();
		System.out.println("Checking the given word is Palindrome or not...");
		n=name.length();
		for(i=0,j=n-1;i<n/2;i++,j--){
			if(name.charAt(i)!= name.charAt(j)){ 
			//if(name[i]!=name[j]) raises error
				flag=-1;
				break;
			}
		}	
	try {
		Thread.sleep(1570); }
	catch(InterruptedException ex){
		ex.printStackTrace();}
	System.out.println("The Output of the program is..");
	try {
		Thread.sleep(500); }
	catch(InterruptedException ex){
		ex.printStackTrace();}
	if(flag==0){
		System.out.println("Given word is a palindrome");}
	else 
		System.out.println("Given word is not a  palindrome");
	}
} 

/*Notes:
1. to access a charcter in string string[index] doesnt work in java
   to do it use strname.charAt(index) method 
2. never just declare variable,assign some value
   variables which are uninitialised when used again may throw error sometimes
*/