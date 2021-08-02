import java.util.Scanner;

public class readInput {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int sum = 0;
        int inputNumber = 0;

        while (inputNumber != 'x'){
            inputNumber = readInput.nextInt();
            sum += inputNumber;
        }
        readInput.close();

        System.out.println("Sum of entered nubers: " + sum);

    }
}
