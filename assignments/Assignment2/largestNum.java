//6. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        System.out.print("Enter two numbers : ");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int large;
        if(n1>n2){
            large = n1;
        }
        else if(n2>n1){
            large = n2;
        }
        else{
            System.out.println("Both numbers are equal and they are "+n1+" and "+n2);
            return;
        }
        System.out.println("Largest Number = "+large+"   ( among "+n1+" and "+n2+" )");
    }
}
