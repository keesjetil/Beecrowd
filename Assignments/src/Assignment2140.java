import java.util.Scanner;

public class Assignment2140 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var N = scn.nextInt();
        var M = scn.nextInt();
        while (N != 0 && M != 0) {
            var change = M-N;
            if (change == 7 || change == 12 || change == 22 || change==52 || change == 102) {
                System.out.println("possible");
            } else if (change == 15 || change == 25 || change == 55 || change == 105) {
                System.out.println("possible");
            } else if (change == 30 || change == 60 || change == 110) {
                System.out.println("possible");
            } else if (change == 70 || change == 120) {
                System.out.println("possible");
            } else if (change == 150) {
                System.out.println("possible");
            } else {
                System.out.println("impossible");
            }
            N = scn.nextInt();
            M = scn.nextInt();
        }

    }
}
