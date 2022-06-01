import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n==0){
            System.out.println(1);
        }
        else if(n==1){
            System.out.println(1 +"\n"+ 1);
        }
        else if(n>1){
            System.out.println(1 +"\n"+ 1);
            int n1=1,n2=1,fib=0;
            for(int i=2;i<n;i++){
                fib=n1+n2;
                n1=n2;n2=fib;
                System.out.println(fib);
            }
        }
    }
}
