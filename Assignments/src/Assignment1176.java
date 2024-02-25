import java.util.Scanner;

public class Assignment1176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] fibonSeq = new long[61];
        fibonSeq[0] = 0;
        fibonSeq[1] = 1;
        for(int i=2; i<61; i++){
            fibonSeq[i] = fibonSeq[i-2] + fibonSeq[i-1];
        }

        var t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            var n = sc.nextInt();
            System.out.printf("Fib(%d) = %d%n", n, fibonSeq[n]);
        }
        sc.close();
    }
}
