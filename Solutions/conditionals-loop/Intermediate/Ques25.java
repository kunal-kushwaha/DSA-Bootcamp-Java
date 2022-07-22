package Intermediate;
// Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.
public class Ques25 {
    public static void main(String[] args) {
        int totalDays = 0;
        for (int i = 2; i <=30 ; i++) {
            if (i%2 == 0) totalDays++;
        }
        System.out.println(totalDays);
    }
}
