import java.util.Scanner;

public class Assignment1149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        var N = scanner.nextInt();
        while (N <= 0) {
            N = scanner.nextInt();
        }

        var sum = 0;
        for(int i = A; i<A+N; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
