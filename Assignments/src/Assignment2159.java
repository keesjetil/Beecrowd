import java.util.Scanner;

public class Assignment2159 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n = scn.nextInt();

        var lowerBound = n / Math.log(n);
        var upperBound = 1.25506*lowerBound;
        System.out.printf("%.1f %.1f%n", lowerBound, upperBound);
    }
}
