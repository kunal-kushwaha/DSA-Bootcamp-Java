    import java.util.Scanner;
import java.lang.String;
public class fourthAnswer {
    public static void main(String[] args) {
//        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers");

            int num1=sc.nextInt();
            int num2=sc.nextInt();

            String sign= sc.next();

            if(sign.equals("+")){                           // here sign == "+" will not work
                System.out.println("Num1 + Num2 = "+ (num1+num2));
            }else if (sign.equals("-")) {
                System.out.println("Num1 - Num2 = "+ (num1-num2));
            }else if(sign.equals("*")){
                System.out.println("Num1 * Num2 = "+ (num1*num2));
            }else{
                System.out.println("Num1 / Num2 = "+ (num1/num2));
            }
    }
}
