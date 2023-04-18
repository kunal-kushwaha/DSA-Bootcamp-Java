package SolvedProblems.Recursion;

public class TrianglePattern {
    static void patternPrint1(int row, int col){
        if(row == 0){
            return;
        }

        if(col < row){
            patternPrint1(row, col + 1);
            System.out.print("*");
        } else{
            patternPrint1(row - 1, 0);
            System.out.println();
        }

    }

    static void patternPrint(int row, int col){
        if(row == 0){
            return;
        }

        if(col < row){
            System.out.print("*");
            patternPrint(row, col + 1);
        } else{
            System.out.println();
            patternPrint(row - 1, 0);
        }

    }
    public static void main(String[] args) {
        int n = 5;
        // patternPrint(n, 0);
        patternPrint1(n, 0);
    }
}
