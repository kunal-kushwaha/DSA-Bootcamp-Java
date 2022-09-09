
import java.util.Scanner;
public class ninethans {
   public static void main(String args[]){
      int num1, num2;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number ::");
      num1 = sc.nextInt();
      System.out.println("Enter the second number ::");
      num2 = sc.nextInt();

      for (int i = num1; i<num2; i++){
         int check, reminder, sum = 0;
         check = i;
         while(check != 0) {
            reminder = check % 10;
            sum = sum + (reminder * reminder * reminder);
            check = check / 10;
         }
         if(sum == i){
            System.out.println(""+i);
         }
      }
   }
}