import java.util.Scanner;

public class thirdAnswers {
    public static void main(String[] args) {
        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers");
        int principal  = sc.nextInt();
        System.out.println();
        int time = sc.nextInt();
        System.out.println();
        int rate= sc.nextInt();
        System.out.println();

        System.out.println("Simple Interest:- "+ principal*rate*time);
    }
}
