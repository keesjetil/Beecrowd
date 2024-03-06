import java.io.IOException;
import java.util.Scanner;

public class Assignment1827 {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        while (scn.hasNextLine()) {
            var N = Integer.parseInt(scn.nextLine());
            if(N%2==0){
                return;
            }
            int[][] arr = new int[N][N];

            for (int i = 0; i < arr.length; i++) {
                arr[i][arr.length - i - 1] = 3;
                arr[i][i] = 2;
            }

            //ones last
            for (int i = arr.length / 3; i < arr.length - arr.length / 3; i++) {
                for (int j = arr.length / 3; j < arr.length - arr.length / 3; j++) {
                    arr[i][j] = 1;
                }
            }

            arr[N / 2][N / 2] = 4;

            for (int k = 0; k < arr.length; k++) {
                for (int l = 0; l < arr.length; l++) {
                    if (l == arr.length - 1) {
                        System.out.println(arr[k][l]);
                    } else {
                        System.out.print(arr[k][l]);
                    }
                }
            }
        }
        scn.close();


    }
}
