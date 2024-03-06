import java.io.IOException;
import java.util.Scanner;

public class Assignment1789 {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        while (scn.hasNextInt()) {
            var N = scn.nextInt();
            var level = 1;
            for (int i = 0; i < N; i++) {
                var L = scn.nextInt();
                if(L>=10 && L < 20 && level != 3){
                    level = 2;
                }
                if(L>= 20){
                    level = 3;
                }
            }
            System.out.println(level);
        }
        scn.close();

    }
}
