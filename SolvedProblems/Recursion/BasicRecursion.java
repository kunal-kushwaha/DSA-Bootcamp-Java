package SolvedProblems.Recursion;

public class BasicRecursion {
    public static void message() {
        System.out.println("Hello world");
        message1();
    }

    public static void message1() {
        System.out.println("Hello world");
        message2();
    }

    public static void message2() {
        System.out.println("Hello world");
        message3();
    }

    public static void message3() {
        System.out.println("Hello world");
        message4();
    }

    public static void message4() {
        System.out.println("Hello world");
    }

    public static void printing(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printing(n + 1);
    }

    public static void main(String[] args) {
        // Function call without recursion
        message();

        // Trying to do the same with recursion
        printing(1);

    }
}
