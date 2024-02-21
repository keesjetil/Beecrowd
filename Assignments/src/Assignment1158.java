import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1158
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        var N = scn.nextInt();
        for(int i=1; i<=N; i++){
            var X = scn.nextInt();
            var Y = scn.nextInt();
            var counter = 0;
            var sum = 0;
            while(counter != Y){
                if(X % 2 == 1 || X % 2 == -1){
                    sum += X;
                    counter ++;
                }
                X ++;
            }
            System.out.println(sum);
        }
    }
}
