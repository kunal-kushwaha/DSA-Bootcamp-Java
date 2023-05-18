package SolvedProblems.Backtracking.Maze;

import java.util.Arrays;

public class MazeAllPaths {
    // Here we take a boolean array maze which shows were the obstacles are and
    // paths are, we use these things to identify paths
    public static void printingPathsWithObstaclesAnywhere(String processed, int row, int col, boolean[][] maze) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(processed);
            return;
        }
        if (maze[row][col] == false) {
            return;
        }
        if (row < maze.length - 1) {
            printingPathsWithObstaclesAnywhere(processed + "D", row + 1, col, maze);
        }
        if (col < maze[0].length - 1) {
            printingPathsWithObstaclesAnywhere(processed + "R", row, col + 1, maze);
        }
    }

    // Here the directions are all 4 ways: U D L R
    public static void allPaths(String processed, int row, int col, boolean[][] maze) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(processed);
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        maze[row][col] = false;
        if (row < maze.length - 1) {
            allPaths(processed + "D", row + 1, col, maze);
        }
        if (col < maze[0].length - 1) {
            allPaths(processed + "R", row, col + 1, maze);
        }
        if (row > 0) {
            allPaths(processed + "U", row - 1, col, maze);
        }
        if (col > 0) {
            allPaths(processed + "L", row, col - 1, maze);
        }
        // Reverting the changes that I've made in Nth recursion call to original to
        // preserve the original content
        maze[row][col] = true;
    }

    public static void allPathsMatrix(String processed, int row, int col, boolean[][] maze, int[][] path, int count){
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = ++count;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(processed);
            System.out.println("-------");
            count--;
            path[row][col] = 0;
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        maze[row][col] = false;
        count++;
        path[row][col] = count;
        if (row < maze.length - 1) {
            allPathsMatrix(processed + "D", row + 1, col, maze, path, count);
        }
        if (col < maze[0].length - 1) {
            allPathsMatrix(processed + "R", row, col + 1, maze, path, count);
        }
        if (row > 0) {
            allPathsMatrix(processed + "U", row - 1, col, maze, path, count);
        }
        if (col > 0) {
            allPathsMatrix(processed + "L", row, col - 1, maze, path, count);
        }
        // Reverting the changes that I've made in Nth recursion call to original to
        // preserve the original content
        maze[row][col] = true;
        count--;
        path[row][col] = 0;
    }

    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        // for (boolean[] row : maze) {
        //     System.out.println(Arrays.toString(row));
        // }
        // printingPathsWithObstaclesAnywhere("", 0, 0, maze);
        // allPaths("", 0, 0, maze);

        int[][] path = new int[maze.length][maze[0].length];
        allPathsMatrix("", 0, 0, maze, path, 0);

    }
}
