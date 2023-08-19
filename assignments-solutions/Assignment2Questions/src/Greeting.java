import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        System.out.print("Enter name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.print("Greetings " + name + ", Hope you are doing great!");
    }
}
