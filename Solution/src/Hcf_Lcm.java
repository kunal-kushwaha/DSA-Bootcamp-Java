import java.util.Scanner;

public class Hcf_Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int t1=n1;
        int t2=n2;
        int temp;
        while(t2!=0){
            temp=t2;
            t2=t1%t2;
            t1=temp;
        }
        int hcf=t1;
        int lcm=n1*n2/hcf;
        System.out.println(hcf+" "+lcm);

    }
}
