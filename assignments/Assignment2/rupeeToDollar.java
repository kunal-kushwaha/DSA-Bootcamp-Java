//8. Input currency in rupee and output in dollar.

import java.util.Scanner;

public class rupeeToDollar {
    public static void main(String[] args) {
        System.out.print("Enter currency in Rupees : ");
        Scanner in = new Scanner(System.in);
        double rupees = in.nextDouble();
        double dollars = Math.round(rupees/74.20);
        System.out.println(rupees+" rupees = "+dollars+" dollars");

    }
}
