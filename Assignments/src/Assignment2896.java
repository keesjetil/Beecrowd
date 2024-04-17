import java.util.Scanner;

public class Assignment2896 {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var t = scn.nextInt();
        for(int i=0; i< t; i++){
            var N = scn.nextInt();
            var K = scn.nextInt();

            var fullMinusEmpty = N / K;


            System.out.println(fullMinusEmpty + N%K);
        }
    }
}
