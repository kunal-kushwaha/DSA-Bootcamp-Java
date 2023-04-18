package SolvedProblems.Recursion;

public class NoOfZeros {
    static int noOfZeros(int n, int count){
        if(n == 0){
            return count;
        }

        if(n % 10 == 0){
            count++;
        }

        return noOfZeros(n / 10, count);
    }
    public static void main(String[] args) {
        int n = 30434340;
        System.out.println(noOfZeros(n, 0));
    }
}
