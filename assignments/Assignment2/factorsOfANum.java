//7. Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class factorsOfANum {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }

}
