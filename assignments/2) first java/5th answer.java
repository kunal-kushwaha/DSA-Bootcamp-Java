import java.util.Scanner;
public class fans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        if(x>y){
            System.out.println("X is greatest");
        }else{
            System.out.println("Y is greatest");
        }
    }
    
}
