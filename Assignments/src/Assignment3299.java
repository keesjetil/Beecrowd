import java.util.Scanner;

public class Assignment3299 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        if (N.contains("13")) {
            System.out.printf("%s es de Mala Suerte%n", N);
        } else {
            System.out.printf("%s NO es de Mala Suerte%n", N);

        }

    }
}
