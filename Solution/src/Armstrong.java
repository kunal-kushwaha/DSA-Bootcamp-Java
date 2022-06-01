public class Armstrong {
    public static void main(String[] args) {
        int n=371;
        int m=n;
        int s=0;
        while(n!=0){
            int r=n%10;
            int divd=n/10;
            n=divd;
            s+=r*r*r;
//            System.out.println(s);
        }
        if(s==m){
            System.out.println("It's ArmStrong Number");
        }
        else{
            System.out.println("Not ArmStrong Number");
        }
    }
}
