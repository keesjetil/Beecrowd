import java.util.Scanner;

public class Assignment2987 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charToTrans = scanner.next().toUpperCase().charAt(0);
        System.out.println((int) charToTrans - 64);
    }
}
