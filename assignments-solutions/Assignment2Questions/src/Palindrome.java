import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = input.nextLine();

//        String orgStr = str;
        String revStr = "";

        for (int i = str.length()-1; i>=0; i--) {
            revStr = revStr + str.charAt(i);
        }

//        System.out.println(revStr);
//        System.out.println(str);

        if(str.equals(revStr)) {
            System.out.print("Given string is Palindrome");
        }
        else {
            System.out.printf("Given string is !Palindrome");
        }
    }
}
