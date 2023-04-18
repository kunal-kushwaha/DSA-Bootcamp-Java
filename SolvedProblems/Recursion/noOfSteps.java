package SolvedProblems.Recursion;

public class noOfSteps {
    static int count = 0;
    static int numberOfSteps(int num) {
        if(num == 0){
            return count - 1;
        }

        count++;
        if(num % 2 == 0){
            return numberOfSteps(num / 10);
        }
        else{
            return numberOfSteps(num - 1);
        }
    }

    public static void main(String[] args) {
        int n = 14;
        System.out.println(numberOfSteps(n));
    }
}
