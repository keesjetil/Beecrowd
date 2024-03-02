import java.util.Scanner;


public class Assignment1146 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = 0;

        while (scan.hasNextInt()) {
            X = scan.nextInt();

            if (X == 0) {
                break;
            }

            for (int i = 1; i <= X; i++) {
                if (i < X) {
                    System.out.printf("%d ", i);
                } else {
                    System.out.printf("%d\n", i);
                }
            }
        }
    }
}
