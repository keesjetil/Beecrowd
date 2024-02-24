import java.util.Scanner;

public class Assignment3302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var N = scanner.nextInt();
        for(int i=1; i<=N; i++){
            System.out.printf("resposta %d: %d%n", i, scanner.nextInt());
        }
    }
}
