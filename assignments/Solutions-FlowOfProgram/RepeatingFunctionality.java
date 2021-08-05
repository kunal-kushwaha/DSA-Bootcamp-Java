import java.util.Scanner;
public class RepeatingFunctionality{
  public static void main(String[] args){
    int input,sum=0;
    System.out.println("Enter a series of values (0 to quit) : ");
    Scanner in=new Scanner(System.in);
    while((input=in.nextInt())!=0){
      sum+=input;
    }
    System.out.println("The sum of the enterd series of values is: "+sum);
  }
}
