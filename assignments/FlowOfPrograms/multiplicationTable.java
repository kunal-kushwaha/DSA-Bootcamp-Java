import java.util.Scanner;

class MultiplicationTable{
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int inputNumber = readInput.nextInt();
        readInput.close();
        int multiplier = 1;

        while (multiplier <= 10) {
            System.out.println(inputNumber + " X " + multiplier + " = " + inputNumber*multiplier);
            multiplier += 1;
        }
    }
}