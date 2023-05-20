package SolvedProblems.Backtracking.Maze;

import java.util.ArrayList;

public class MazeNoOfPaths {
    public static int noOfPaths(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        // Move down
        int left = noOfPaths(row - 1, col);

        // Move right
        int right = noOfPaths(row, col - 1);

        return left + right;
    }

    public static void printingPaths(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(processed);
            return;
        }

        if (row > 1)
            printingPaths(processed + "D", row - 1, col);

        if (col > 1)
            printingPaths(processed + "R", row, col - 1);
    }

    public static void printingPathsIncludingDiagnols(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(processed);
            return;
        }

        if (row > 1 && col > 1) {
            printingPathsIncludingDiagnols(processed + "D", row - 1, col - 1);
        }

        if (row > 1) {
            printingPathsIncludingDiagnols(processed + "V", row - 1, col);
        }

        if (col > 1) {
            printingPathsIncludingDiagnols(processed + "H", row, col - 1);
        }
    }

    // Assuming obstacle is in 2,2
    public static void printingPathsWithObstacles(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(processed);
            return;
        }

        if(row == 2 && col == 2){
            return;
        }

        if (row > 1) {
            printingPathsWithObstacles(processed + "D", row - 1, col);
        }

        if (col > 1) {
            printingPathsWithObstacles(processed + "R", row, col - 1);
        }

    }

    public static ArrayList<String> returningPaths(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (row > 1) {
            list.addAll(returningPaths(processed + "D", row - 1, col));
        }

        if (col > 1)
            list.addAll(returningPaths(processed + "R", row, col - 1));

        return list;
    }

    public static void storingPaths(ArrayList<ArrayList<String>> result, ArrayList<String> processed, int row,
            int col) {
        if (row == 1 && col == 1) {
            result.add(new ArrayList<>(processed));
            return;
        }

        if (row > 1) {
            processed.add("D");
            storingPaths(result, processed, row - 1, col);
        }

        if (col > 1) {
            processed.add("R");
            storingPaths(result, processed, row, col - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(noOfPaths(3, 3));
        printingPaths("", 3, 3);
        printingPathsIncludingDiagnols("", 3, 3);

        printingPathsWithObstacles("", 3, 3);

        System.out.println(returningPaths("", 3, 3));
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        storingPaths(result, new ArrayList<>(), 3, 3);
        System.out.println(result);
    }
}
