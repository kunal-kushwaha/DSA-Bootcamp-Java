package kartheek.flowOfProgram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a valid year: ");
        int year = in.nextInt();
        System.out.println(leapYear(year));
    }
    static boolean leapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
