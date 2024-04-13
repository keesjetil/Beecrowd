import java.io.IOException;
import java.util.Scanner;

public class Assignment3416 {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        var N = scn.nextInt();
        var L = scn.nextInt();
        var D = scn.nextInt();

        double totalNeeded = (double) (D * N) / 1000;
        var totalCoffeToGet = L;
        while(totalCoffeToGet < totalNeeded){
            totalCoffeToGet += L;
        }
        System.out.println(totalCoffeToGet);
    }
}
