import java.util.Scanner;

class LeapYear{
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int year = inputReader.nextInt();
        inputReader.close();
        boolean isLeapYear;

        if (year%400 == 0){
            isLeapYear = true;
        } else if (year%100 == 0){
            isLeapYear = false;
        } else if (year%4 == 0){
            isLeapYear = true;
        } else{
            isLeapYear = false;
        }

        if (isLeapYear){
            System.out.println(year + " is a leap year");
        } else{
            System.out.println(year + " is not a leap year");
        }
    }
}