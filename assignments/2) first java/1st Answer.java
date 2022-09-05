import java.util.Scanner;

public class firstAnswer {
    public static void main(String[] args) {
//        Write a program to print whether a number is even or odd, also take input from the user.
        int number;//Initializing
        Scanner sc=new Scanner(System.in);

        System.out.print("Please Enter the number: ");
        number=sc.nextInt();//Taking Input from user

        //Logic
        if(number % 2 == 0){
            System.out.println("The number: "+ number+ " is Even");
        }else{
            System.out.println("The number: "+ number+ " is Odd");
        }
    }
}
