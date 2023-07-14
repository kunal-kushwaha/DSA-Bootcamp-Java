import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
        System.out.print("Enter you name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String greetingMessage = "Hello, " + name + " !";

        System.out.println(greetingMessage);

        input.close();
    }
}
