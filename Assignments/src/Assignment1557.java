import java.util.Scanner;

public class Assignment1557 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var N = -1;
        while(N != 0){
            N = scn.nextInt();
            var t = 0;
            int[][] arr = new int[N][N];
            while(t <= N){
                for(int i=0; i<N; i++){
                    for(int j=0; j<N; j++){
                        arr[i][j] = (int) Math.pow(2,i+j);
                    }
                }
                t++;
            }

            printMatrix(arr);
        }
        scn.close();
    }

    private static void printMatrix(int[][] matrix) {
        StringBuilder sb = new StringBuilder();

        for (int[] mat : matrix) {
            for (int j = 0; j < mat.length; j++) {
                if (j == 0) {
                    sb.append(String.format("%4d", mat[j]));
                } else {
                    sb.append(String.format("%4d", mat[j]));
                }
            }
            sb.append("\n");
        }
        sb.append("\n");

        System.out.print(sb.toString());
    }
}
