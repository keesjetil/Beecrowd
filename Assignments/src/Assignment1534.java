import java.util.Scanner;

public class Assignment1534 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true){
            var N = scn.nextInt();
            int[][] arr = threes(N);
            for (int i = 0; i < N; i++) {
                arr[i][i] = 1;
                arr[N - 1 - i][i] = 2;
            }
            printMatrix(arr);
        }
    }

    private static int[][] threes(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 3;
            }
        }
        return arr;
    }

    private static void printMatrix(int[][] matrix) {
        StringBuilder sb = new StringBuilder();

        for (int[] mat : matrix) {
            for (int j = 0; j < mat.length; j++) {
                sb.append(mat[j]);
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
