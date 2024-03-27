import java.util.Locale;
import java.util.Scanner;

public class Assignment1963 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var N = Double.parseDouble(scn.next());
        var M = Double.parseDouble(scn.next());
        Locale locale = Locale.US;
        System.out.printf(locale,"%.2f%%%n",((M-N) / N) * 100);
    }
}
