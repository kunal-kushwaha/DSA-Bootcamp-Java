
/* 8. Input currency in rupee and output in dollar. */
import java.util.Scanner;

public class Currency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency in rupees : ");
        double rupees = sc.nextDouble();
        System.out.println("The currency in dollar is $" + rupees * 0.013); // multiply the indian rupees with current
                                                                            // conversion rate of dollar to get currency
                                                                            // in dollar
        sc.close();
    }
}
