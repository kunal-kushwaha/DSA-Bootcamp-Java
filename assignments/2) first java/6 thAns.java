import java.util.Scanner;
public class sixthAns {
    public static void main(String[] args) {
        //Input currency in rupees and output in USD.
        // to take input from user we use Scanner class
        Scanner scan=new Scanner(System.in);
        System.out.println();
        int rupees=scan.nextInt();
        System.out.println("In USD = " + (rupees/75));
    }
}
