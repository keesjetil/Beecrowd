import java.util.Scanner;

public class Assignment2061 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var N = scn.nextInt();
        var M = scn.nextInt();
        for (int i = 0; i < M; i++) {
            String action = scn.next();
            if (action.equals("fechou")) {
                N += 1;
            } else {
                N -= 1;
            }
        }
        System.out.println(N);
    }
}
