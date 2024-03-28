import java.util.Scanner;

public class Assignment1957 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var N = scn.nextInt();
        String hex = Integer.toHexString(N);
        System.out.println(hex.toUpperCase());
    }
}
