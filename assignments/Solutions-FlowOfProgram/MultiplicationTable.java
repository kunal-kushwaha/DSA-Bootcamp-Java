import java.util.*;
public class MultiplicationTable{
  System.out.println("Enter a number to make it's Multiplication table: ");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=0;i<=10;i++){
    System.out.printf("%d X %d = %d\n",n,i,n*i);
  }
}
