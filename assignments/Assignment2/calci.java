//5. Take in two numbers and an operator (+, -, *, /) and calculate the value.(Use if conditions)

import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        System.out.print("Enter two numbers and an operator : ");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        char ch = in.next().charAt(0);
        int result;
        if(ch == '+'){
            result = n1+n2;
        }
        else if(ch == '-'){
            result = n1-n2;
        }
        else if(ch == '*'){
            result = n1*n2;
        }
        else if(ch == '/'){
            result = n1/n2;
        }
        else{
            System.out.println("Enter a valid Operator");
            return;
        }
        System.out.println(n1+" "+ch+" "+n2+" = "+result);

    }
}
