import java.util.Scanner;

public class Assignment1022 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            var N1 = scn.nextInt();
            scn.next();
            var D1 = scn.nextInt();
            var sign = scn.next();
            var N2 = scn.nextInt();
            scn.next();
            var D2 = scn.nextInt();
            int gcd = -1;
            switch (sign) {
                case "+" -> {
                    var A = (N1 * D2 + N2 * D1);
                    var B = D1 * D2;
                    gcd = getGcd(A, B);
                    var AA = A / gcd;
                    var BB = B / gcd;
                    System.out.println(A + "/" + B + " = " + AA + "/" + BB);
                }
                case "-" -> {
                    var A = (N1 * D2 - N2 * D1);
                    var B = D1 * D2;
                    gcd = getGcd(Math.abs(A), B);
                    var AA = A / gcd;
                    var BB = B / gcd;

                    System.out.println(A + "/" + B + " = " + AA + "/" + BB);

                }
                case "*" -> {
                    var A = ((N1 * N2));
                    var B = D1 * D2;
                    gcd = getGcd(A, B);
                    var AA = A / gcd;
                    var BB = B / gcd;
                    System.out.println(A + "/" + B + " = " + AA + "/" + BB);
                }
                case "/" -> {
                    var A = (N1 * D2);
                    var B = N2 * D1;
                    gcd = getGcd(A, B);
                    var AA = A / gcd;
                    var BB = B / gcd;
                    System.out.println(A + "/" + B + " = " + AA + "/" + BB);
                }
            }
        }
    }

    private static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }
}
