import java.util.Scanner;

public class Assignment1478 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var N = -1;
        while(N != 0){
            N = scn.nextInt();
            var t = 0;
            int[][] arr = new int[N][N];
            while(t <= N){
                for(int i=0; i<N; i++){
                    if(i+t > N-1){
                        continue;
                    }else{
                        arr[i][i+t] = t+1;
                        arr[i+t][i] = t+1;
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
                    sb.append(String.format("%3d", mat[j]));
                } else {
                    sb.append(String.format(" %3d", mat[j]));
                }
            }
            sb.append("\n");
        }
        sb.append("\n");

        System.out.print(sb.toString());
    }
}
