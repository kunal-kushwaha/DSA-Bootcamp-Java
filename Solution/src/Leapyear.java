import java.util.Scanner;

public class Leapyear{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean x=false;
        int yr=sc.nextInt();
        if(yr%4==0){
            if(yr%100==0){
                if(yr%400==0){
                    x=true;
                }
                else{
                    x=false;
                }
            }
            else{
                x=true;
            }
        }else{
            x=false;
        }
        if (x){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("NOT LEAP YEAR");
        }
    }
}