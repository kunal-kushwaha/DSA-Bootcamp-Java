import java.util.Scanner;

public class thirdAnswers {
    public static void main(String[] args) {
        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner sc= new Scanner(System.in);
        int principal  = sc.nextInt();
        int time = sc.nextInt();
        int rate= sc.nextInt();

        System.out.println("Simple Interest:- "+ principal*rate*time);
    }
}
