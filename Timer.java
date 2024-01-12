import java.util.Scanner;
import java.util.Date;
class Timer{
	public static void main(String args[]){
		
		int t=1,len;
		System.out.println("Enter the Countdown time with suffix 's' for secs,'m' for mins, 'h' for hrs");
		Scanner sc=new Scanner(System.in);
		String time = sc.next();
		len=time.length();
		t=Integer.parseInt(time.substring(0,len-1));
		char timein=time.charAt(len-1);
		switch(timein){
			case 's' : t=t*1000;
			break;
			case 'm' : t=t*60*1000;
			break;
			case 'h' : t=t*60*60*1000;
			break;
		}
	System.out.println("Countdown is Running.....");	
	try {
		Thread.sleep(t); }
	catch(InterruptedException ex){
		ex.printStackTrace();}
	System.out.println("Timer is up");
}
}