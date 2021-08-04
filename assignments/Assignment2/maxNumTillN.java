//10. Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class maxNumTillN {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxi = n;
        while(n!=0){
            System.out.print("Enter number : ");
            n = in.nextInt();
            maxi = Math.max(maxi,n); // if(maxi<n){maxi=n}
        }
        System.out.println("Maximum number is "+maxi);
    }
}
