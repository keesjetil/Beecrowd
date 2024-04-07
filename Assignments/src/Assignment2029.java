import java.util.Scanner;

public class Assignment2029 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var pi= 3.14;
        while(scn.hasNextLine()) {
            var V = Double.parseDouble(scn.nextLine()); //pi r**2 * h
            var D = Double.parseDouble(scn.nextLine());

            var h = (V / pi) / Math.pow(D/2,2);
            double a = pi*Math.pow(D/2,2);
            System.out.printf("ALTURA = %.2f%n", h);
            System.out.printf("AREA = %.2f%n", a);
        }
    }
}
