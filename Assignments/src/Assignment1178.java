import java.util.Locale;
import java.util.Scanner;

public class Assignment1178 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var N = Double.parseDouble(scn.nextLine());
        for(int i=0; i<100; i++){
            System.out.printf(Locale.US,"N[%d] = %.4f%n", i , N);
            N = N/2;
        }
    }
}
