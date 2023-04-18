package SolvedProblems.BitManipulation;

public class FlipImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (image[i].length + 1) / 2; j++) {
                int temp = image[i][image[i].length - 1 - j] ^ 1;
                image[i][image[i].length - 1 - j] = image[i][j] ^ 1;
                image[i][j] = temp;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };

        flipAndInvertImage(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
